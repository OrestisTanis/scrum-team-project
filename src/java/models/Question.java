/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author Walter
 */
public class Question implements Serializable {
    /* Fields */
    String text;
    int id;
    /* Constructors */
    public Question() {
    }
    public Question(String question) {
        this.text = question;
    }

    
    public int getId() {
        return id;
    }

    /* Getters Setters */
    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /* Methods */
    @Override
    public String toString() {
        return "Question{" + "text=" + text + '}';
    }
}
