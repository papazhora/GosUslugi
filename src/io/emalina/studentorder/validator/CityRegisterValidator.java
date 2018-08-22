package io.emalina.studentorder.validator;

import io.emalina.studentorder.domain.AnswerCityRegister;
import io.emalina.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;
    public int port;
    public String login;
    public String password;

    public AnswerCityRegister checkCityRegister(StudentOrder so) {

        AnswerCityRegister ans = new AnswerCityRegister();
        ans.sucsses = true;
        System.out.println("City register is running: "
                + hostName + ", " + login + ", " + password + ", " + ans.sucsses);
        return ans;
    }
}
