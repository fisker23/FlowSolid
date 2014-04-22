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
    private Engine engine;

    public Control() {     
    }
  /**
     * Pre: Post: A new word pair is added to the existing collection of word
     * pairs. This method does not save to file!
     */
    
    public void add(String question, String answer){
        engine.add(question, answer);
    }
    /**
     * Pre: Post: Returns the number of wordpairs in the collection (not the file).
     */
    public int size(){
        return engine.size();
    }
    /**
     * Pre: At least one word pair must be present Post: Returns a question
     * randomly selected from the collection of word pairs.
     */
    public String getRandomQuestion(){
        return engine.getRandomQuestion();
    }
    
    /**
     * Pre: Post: Returns true if (question, quess) exists as a word pair in the
     * collection, otherwise false.
     */
    public boolean checkGuess(String question, String quess){
        return engine.checkGuess(question, quess);
    }

    /**
     * Pre: Post: Returns the answer corresponding to the question if this
     * exists in the collection. Otherwise it returns null.
     */
    public String lookup(String question){
        return engine.lookup(question);
    }
    
    /**
     * Pre: Post: Word pairs are read from the file "filename" and added to the
     * collection of word pairs. Returns true if successfully done. Otherwise it
     * returns false.
     */
    public boolean load(String filename){
        return engine.load(filename);
    }

    /**
     * Pre: Post: All word pairs from the collection has been written to the
     * file "filename" Returns true if successfully done. Otherwise false.
     */
    public boolean save(String filename){
        return engine.save(filename);
    
    }
    /**
     * Pre: Post: The existing collection of word pairs is cleared
     */
    public void clear(){
        engine.clear();
    }
}