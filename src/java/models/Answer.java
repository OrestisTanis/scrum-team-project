/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Walter
 */
public class Answer {
    /* Fields */
    String answerText;
    
    /* Constructors */
    public Answer() {
    }
    public Answer(String answerText) {
        this.answerText = answerText;
    }

    /* Getters Setters */
    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    /* Methods */
    @Override
    public String toString() {
        return "Answer{" + "answerText=" + answerText + '}';
    }
    
    
    
}
