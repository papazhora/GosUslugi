package io.emalina.studentorder.validator;

import io.emalina.studentorder.domain.AnswerChildren;
import io.emalina.studentorder.domain.StudentOrder;

public class ChildrenValidator {

    public String hostName;
    public String login;
    public String password;

    public AnswerChildren checkCildren(StudentOrder so) {
        System.out.println("Check Children: " + hostName + ", " + login + ", " + password);
        AnswerChildren ans = new AnswerChildren();
        ans.sucsses = true;
        return ans;
    }
}
