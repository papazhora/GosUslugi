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
       StudentOrderValidator sov = new StudentOrderValidator();
       sov.checkAll();

    }

    public void checkAll() {
        StudentOrder[] soArray = readStudentOrder();

        for (int i = 0; i < soArray.length; i++) {
            checkOneOrder(soArray[i]);
        }
    }

    public StudentOrder[] readStudentOrder()
    {
        return readStudentOrder.readStudentOrder();
    }


    public void checkOneOrder(StudentOrder so) {

            AnswerCityRegister cityAnswer = checkCityRegister(so);

            AnswerStudent studAnswer = checkStudent(so);

            AnswerWedding weddingAnswer = checkWedding(so);

            AnswerChildren childrenAnswer = checkChildren(so);

            sendMail(so);
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
