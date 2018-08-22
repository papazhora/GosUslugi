package io.emalina.studentorder;

import io.emalina.studentorder.domain.*;
import io.emalina.studentorder.mail.SendMail;
import io.emalina.studentorder.validator.*;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private WeddingValidator weddingVal;
    private SendMail sendMail;
    private ReadStudentOrder readStudentOrder;

    public StudentOrderValidator() {
        cityRegisterVal = new CityRegisterValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        weddingVal = new WeddingValidator();
        sendMail = new SendMail();
        readStudentOrder = new ReadStudentOrder();

    }

    public static void main(String[] args) {
        new StudentOrderValidator().checkAll();

    }

    public void checkAll() {

        while (true) {

            StudentOrder so = readStudentOrder();

            if (so == null) {
                break;
            }

            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.sucsses) {
                continue;
            }

            AnswerStudent studAnswer = checkStudent(so);
            if (!studAnswer.sucsses) {
                continue;
            }
            AnswerWedding weddingAnswer = checkWedding(so);
            if (!weddingAnswer.sucsses) {
                continue;
            }

            AnswerChildren childrenAnswer = checkChildren(so);
            if (!childrenAnswer.sucsses) {
                continue;
            }

            sendMail(so);
        }
    }

    public StudentOrder readStudentOrder() {
       return readStudentOrder.readStudentOrder();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so) {
           return weddingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so) {
       return childrenVal.checkCildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
             return studentVal.checkStudent(so);
    }

    public void sendMail(StudentOrder so)
    {
        sendMail.sandMail(so);
    }

}
