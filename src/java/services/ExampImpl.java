/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import models.QuestionAnswers;
import models.Result;
import models.UserAnswers;

/**
 *
 * @author Walter
 */
public class ExampImpl implements IExam {

    @Override
    public List<QuestionAnswers> getQuestionAnswers() {
        
    }

    @Override
    public boolean saveAnswers(UserAnswers userAnswers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Result getResult() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
