package io.emalina.studentorder.validator;

import io.emalina.studentorder.domain.AnswerCityRegister;
import io.emalina.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;
    public int port;
    public String login;
    public String password;

    private RealCityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new RealCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
