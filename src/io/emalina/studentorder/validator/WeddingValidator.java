package io.emalina.studentorder.validator;

import io.emalina.studentorder.domain.AnswerWedding;
import io.emalina.studentorder.domain.StudentOrder;

public class WeddingValidator {

    public String hostName;
    public String login;
    public String password;

    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Check wedding: " + hostName + ", " + login + ", " + password);
        AnswerWedding ans = new AnswerWedding();
        ans.sucsses = true;
        return ans;
    }
}
