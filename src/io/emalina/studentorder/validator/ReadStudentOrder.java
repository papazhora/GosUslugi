package io.emalina.studentorder.validator;

import io.emalina.studentorder.SaveStudentOrder;
import io.emalina.studentorder.domain.StudentOrder;

public class ReadStudentOrder {

    public StudentOrder[] readStudentOrder() {
        StudentOrder[] soArray = new StudentOrder[3];
        for (int i = 0; i < soArray.length; i++) {
            SaveStudentOrder.buildStudentOrder(i);
        }
        return soArray;
    }
}
