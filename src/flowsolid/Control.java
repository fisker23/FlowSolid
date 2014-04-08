package flowsolid;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bobbie Apitzsch og Andreas Fisker
 */
public class Control implements WordPairControlInterface{
    private ArrayList<wordPair> wordPairList = new ArrayList<>();
    private Random generator = new Random();
    private int userLevel;
    private int rightAnswerCounter; 
    private boolean questionGuessed; //Kun for nuværende question

    public Control() {
        this.userLevel = 1;
        rightAnswerCounter = 0;
        questionGuessed = false;
    }
    

    
    /**
     * Pre: Post: A new word pair is added to the existing collection of word
     * pairs. This method does not save to file!
     */
    
    public void add(String question, String answer){
        wordPairList.add(new wordPair(question, answer));
    }
    
    public void add(String question, String answer, int score){
        wordPairList.add(new wordPair(question, answer, score));
    }
    
    /**
     * Pre: Post: Returns the number of wordpairs in the collection (not the file).
     */
    public int size(){
        return wordPairList.size();
    }
    /**
     * Pre: At least one word pair must be present Post: Returns a question
     * randomly selected from the collection of word pairs.
     */
    public String getRandomQuestion(){
        ArrayList<wordPair> newList = new ArrayList<>();
        for(wordPair wp : wordPairList){
            if(wp.getScore() == userLevel) newList.add(wp);
        }
        if(newList.isEmpty() && userLevel == 5) return "No more questions";
        if(newList.isEmpty()) {         //Hæver brugerens niv, hvis der er ikke flere spg i nuværende level.
            userLevel++;
            return getRandomQuestion();
        }        
        questionGuessed = false;
        return newList.get(generator.nextInt(newList.size())).getQuestion();        
    }
    
    /**
     * Pre: Post: Returns true if (question, quess) exists as a word pair in the
     * collection, otherwise false.
     */
    public boolean checkGuess(String question, String quess){
        for(wordPair wp : wordPairList){
            if(wp.getQuestion().equals(question)){  //Leder efter spg i arrayList
                if(wp.getAnswer().equals(quess)){   //Tjekker om svaret er korrekt
                    if(++rightAnswerCounter == 5) { //Hæver brugerens niv hvis der er 5. rigtige svar.
                        rightAnswerCounter = 0;
                        userLevel++;
                    }
                    return true;
                }
            }
        }
        if (!questionGuessed){      //Hvis der ikke er gættet på spørgsmålet
            questionGuessed = true; 
            rightAnswerCounter -= 2;
        }
        return false;
    }

    /**
     * Pre: Post: Returns the answer corresponding to the question if this
     * exists in the collection. Otherwise it returns null.
     */
    public String lookup(String question){
        for(wordPair wp : wordPairList){
            if (wp.getQuestion().equals(question)) return wp.getAnswer();
        }
        return "doesnt exist";
    }
    
    /**
     * Pre: Post: Word pairs are read from the file "filename" and added to the
     * collection of word pairs. Returns true if successfully done. Otherwise it
     * returns false.
     */
    public boolean load(String filename){
        Scanner scan = null;
        try {
            scan = new Scanner(new File(filename));
            while (scan.hasNext()){
                String str = scan.nextLine();
                String[] parts = str.split(",");
                if(parts.length == 2) add(parts[0], parts[1]);
                else add(parts[0], parts[1], Integer.parseInt(parts[2]));
            }
        scan.close();
        return true;
        }
        catch (Exception e){
            return false;
        }    
    }

    /**
     * Pre: Post: All word pairs from the collection has been written to the
     * file "filename" Returns true if successfully done. Otherwise false.
     */
    public boolean save(String filename){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(filename);
        } catch (Exception e) {
            return false;
        }
        
        for(wordPair wp : wordPairList){
            pw.println(wp.getQuestion() + "," + wp.getAnswer()+ "," + wp.getScore());
        }        
        pw.close();
        return true;
    
    }
    /**
     * Pre: Post: The existing collection of word pairs is cleared
     */
    public void clear(){
        wordPairList.clear();
    }
}