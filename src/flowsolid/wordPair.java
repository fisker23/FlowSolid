/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flowsolid;

/**
 *
 * @author Computer
 */
public class wordPair {
    private String question;
    private String answer;
    private int score;

    public wordPair(String question, String answer, int score) {
        this.question = question;
        this.answer = answer;
        this.score = score;
    }
    public wordPair(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.score = 1;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
    
}
