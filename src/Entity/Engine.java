/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author Bobbie Apitzsch
 */
import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bobbie Apitzsch og Andreas Fisker
 */
public class Engine{
    private HashMap<String, String> wordPairList1 = new HashMap<>();
    private HashMap<String, String> wordPairList2 = new HashMap<>();
    private HashMap<String, String> wordPairList3 = new HashMap<>();
    private Random generator = new Random();

    public Engine() {     
    }
  /**
     * Pre: Post: A new word pair is added to the existing collection of word
     * pairs. This method does not save to file!
     */
    
    public void add(String question, String answer){
        wordPairList1.put(question, answer);
    }
    /**
     * Pre: Post: Returns the number of wordpairs in the collection (not the file).
     */
    public int size(){
        return wordPairList1.size() + wordPairList2.size() + wordPairList3.size();
    }
    /**
     * Pre: At least one word pair must be present Post: Returns a question
     * randomly selected from the collection of word pairs.
     */
    public String getRandomQuestion(){
        int randomnumber = generator.nextInt(100);
        Object[] questions;
        if(randomnumber > 90 && !wordPairList3.isEmpty()) questions = wordPairList3.keySet().toArray();
        else if(randomnumber >70 && !wordPairList2.isEmpty()) questions = wordPairList2.keySet().toArray();            
        else if(!wordPairList1.isEmpty()) questions = wordPairList1.keySet().toArray();
        else return getRandomQuestion();
        return (String) questions[generator.nextInt(questions.length)];
    }
    
    /**
     * Pre: Post: Returns true if (question, quess) exists as a word pair in the
     * collection, otherwise false.
     */
    public boolean checkGuess(String question, String quess){
        moveWord(question, lookup(question).equals(quess));
        return lookup(question).equals(quess);
    }

    public void moveWord(String question, boolean correctGuess){
        if(correctGuess){
            if(wordPairList1.containsKey(question)){ //Flytter spg til næste liste
                wordPairList2.put(question, wordPairList1.get(question));
                wordPairList1.remove(question);
            }
            else if(wordPairList2.containsKey(question)){ //Flytter spg til næste liste
                wordPairList3.put(question, wordPairList2.get(question));
                wordPairList2.remove(question);
            }
        }
        else{
            if(wordPairList2.containsKey(question)){ //Flytter spg til forrige liste
                wordPairList1.put(question, wordPairList2.get(question));
                wordPairList2.remove(question);
            }
            else if(wordPairList3.containsKey(question)){ //Flytter spg til forrige liste
                wordPairList2.put(question, wordPairList3.get(question));
                wordPairList3.remove(question);
            }
        }
    }
    /**
     * Pre: Post: Returns the answer corresponding to the question if this
     * exists in the collection. Otherwise it returns null.
     */
    public String lookup(String question){
        if(wordPairList1.containsKey(question)) return wordPairList1.get(question);
        else if(wordPairList2.containsKey(question)) return wordPairList2.get(question);
        else if(wordPairList3.containsKey(question)) return wordPairList3.get(question);
        else return "<Not in dictionary>";
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
                add(parts[0], parts[1]);
            }
        scan.close();
        return true;
        }
        catch (Exception e){
            
        }
    return false;
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
        
        for(Object o : wordPairList1.keySet()){
            pw.println(o + "," + wordPairList1.get(o));
        }
        for(Object o : wordPairList2.keySet()){
            pw.println(o + "," + wordPairList2.get(o));
        }
        for(Object o : wordPairList3.keySet()){
            pw.println(o + "," + wordPairList3.get(o));
        }
        pw.close();
        return true;
    }    
    /**
     * Pre: Post: The existing collection of word pairs is cleared
     */
    public void clear(){
        wordPairList1.clear();
        wordPairList2.clear();
        wordPairList3.clear();
    }
}
