/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flowsolid;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Computer
 */
public class Control implements WordPairControlInterface{
    private HashMap<String, String> wordPairList = new HashMap<>();
    private ArrayList<String> unAnsweredQuestionList = new ArrayList<>();
    private Random generator = new Random();
/**
     * Pre: Post: A new word pair is added to the existing collection of word
     * pairs. This method does not save to file!
     */
    void add(String question, String answer){
        wordPairList.put(question, answer);
        unAnsweredQuestionList.add(question);
    }

    /**
     * Pre: Post: Returns the number of wordpairs in the collection (not the file).
     */
    int size(){
        return wordPairList.size();
    }

    /**
     * Pre: At least one word pair must be present Post: Returns a question
     * randomly selected from the collection of word pairs.
     */
    String getRandomQuestion(){
        return unAnsweredQuestionList.get(generator.nextInt(unAnsweredQuestionList.size()));
    }

    /**
     * Pre: Post: Returns true if (question, quess) exists as a word pair in the
     * collection, otherwise false.
     */
    boolean checkGuess(String question, String quess){
        if(quess.equals(wordPairList.get(question))){
            unAnsweredQuestionList.remove(question);
            return true;
        }
        return false;
    }

    /**
     * Pre: Post: Returns the answer corresponding to the question if this
     * exists in the collection. Otherwise it returns null.
     */
    String lookup(String question){
        return wordPairList.get(question);
    }

    /**
     * Pre: Post: Word pairs are read from the file "filename" and added to the
     * collection of word pairs. Returns true if successfully done. Otherwise it
     * returns false.
     */
    boolean load(String filename){
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
            return false;
        }    
    }

    /**
     * Pre: Post: All word pairs from the collection has been written to the
     * file "filename" Returns true if successfully done. Otherwise false.
     */
    boolean save(String filename){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(filename);
        } catch (Exception e) {
            return false;
        }
        
        for(String key : wordPairList.keySet()){
            pw.println(key + "," + wordPairList.get(key));
        }        
        pw.close();
        return true;
    
    }

    /**
     * Pre: Post: The existing collection of word pairs is cleared
     */
    void clear(){
        wordPairList.clear();
    }
}
