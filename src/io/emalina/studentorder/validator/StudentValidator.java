package io.emalina.studentorder.validator;

import io.emalina.studentorder.domain.AnswerStudent;
import io.emalina.studentorder.domain.StudentOrder;

public class StudentValidator {

    public String hostName;
    public String login;
    public String password;

    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Check student: " + hostName + ", " + login + ", " + password);
        AnswerStudent ans = new AnswerStudent();
        ans.sucsses = true;
        return ans;
    }
}
