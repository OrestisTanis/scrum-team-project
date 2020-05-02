/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import models.QuestionPossibleAnswers;
import models.Result;
import models.UserAnswers;

/**
 *
 * @author Walter
 */
public class ExampImpl implements IExam {

    @Override
    public List<QuestionPossibleAnswers> getQuestionsWithPossibleAnswers() {
//        List<QuestionAnswers> questionAnswers = examDao.getQuestionAnswers();
//        if (questionAnswers.size() == 0){
//            // Oops, there are no questions
//            return null;
//        }
//        return questionAnswers;


        // Return dummy data for testing
    }

    @Override
    public boolean saveUserSelectedAnswers(UserAnswers userAnswers) {
        //boolean saved = examDao.saveUserSelectedAnswers(userAnswers);
        if (!saved){
            //  oops something went wrong
            return false;
        }
        return true;
    }

    @Override
    public Result getResult(User user) {
//        Result result = examDao.getResult(User user);
//        if (result == null){
//            // oops
//            return null;
//        }
//        return result;


        
        // Return dummy data for testing
    }
    
    @Override
    boolean saveUser(User user){
        // call saveUser from dao
    }
}
