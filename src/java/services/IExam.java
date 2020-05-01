/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;


/**
 *
 * @author Walter
 */
public interface IExam {
    // Get questions from databse
    List<entities.Question> getQuestions();
    
    // Save selected answers to db from the user input
    boolean saveUserSelectedAnswers(entities.UserQuestions);
    
    // Get result from db
    entities.UserQuestions getResults();
}
