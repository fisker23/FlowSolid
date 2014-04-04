package flowsolid;

/**
 *
 * @author CHU
 */

public interface WordPairControlInterface
{
    
/**
     * Pre: Post: A new word pair is added to the existing collection of word
     * pairs. This method does not save to file!
     * @param question
     * @param answer
     */
    void add(String question, String answer);

    /**
     * Pre: Post: Returns the number of wordpairs in the collection (not the file).
     * @return 
     */
    int size();

    /**
     * Pre: At least one word pair must be present Post: Returns a question
     * randomly selected from the collection of word pairs.
     * @return 
     */
    String getRandomQuestion();

    /**
     * Pre: Post: Returns true if (question, quess) exists as a word pair in the
     * collection, otherwise false.
     * @param question
     * @param quess
     * @return 
     */
    boolean checkGuess(String question, String quess);

    /**
     * Pre: Post: Returns the answer corresponding to the question if this
     * exists in the collection. Otherwise it returns null.
     * @param question
     * @return 
     */
    String lookup(String question);

    /**
     * Pre: Post: Word pairs are read from the file "filename" and added to the
     * collection of word pairs. Returns true if successfully done. Otherwise it
     * returns false.
     * @param filename
     * @return 
     */
    boolean load(String filename);

    /**
     * Pre: Post: All word pairs from the collection has been written to the
     * file "filename" Returns true if successfully done. Otherwise false.
     * @param filename
     * @return 
     */
    boolean save(String filename);

    /**
     * Pre: Post: The existing collection of word pairs is cleared
     */
    void clear();
}

