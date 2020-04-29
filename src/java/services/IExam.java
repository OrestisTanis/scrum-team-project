/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import models.QuestionAnswers;
import models.UserAnswers;

/**
 *
 * @author Walter
 */
public interface IExam {
     // Get questions from databse
    List<QuestionAnswers> getQuestionAnswers();
    
    // Save selected answers to db from the user input
    boolean save(UserAnswers userAnswers);
    
    
}
