package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Answer;
import models.Question;
import models.QuestionRightAnswer;
import models.User;

public class QuestionRightAnswerData {

    private static Database db = new Database();

    private static ResultSet getById(int id) {
        ResultSet rs = db.getResults("select u.username, a.text_ans, q.text_quest from users_answers ua\n" +
"join answers a on ua.answer_id = a.id\n" +
"join questions q on q.id = a.question_id\n" +
"join users u on u.id = ua.user_id\n" +
"join right_answers ra\n" +
"where ra.question_id = a.question_id and ra.answer_id = ua.answer_id and u.id = " + id + ";");
        System.out.println("********** resultset: " + rs);
        return rs;
    }

    public static List<QuestionRightAnswer> getByUser(User user) {
        ResultSet rs = getById(user.getId());
        List<QuestionRightAnswer> qraList = new ArrayList();
        try {
            while (rs.next()) {
                Question question = new Question();
                Answer answer = new Answer();
                QuestionRightAnswer qra = new QuestionRightAnswer();
                question.setText(rs.getString(1));
                answer.setText(rs.getString(2));
                qra.setQuestion(question);
                qra.setRightAnswer(answer);
                qraList.add(qra);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return qraList;
    }
}
