package io.emalina.studentorder;

import io.emalina.studentorder.domain.Address;
import io.emalina.studentorder.domain.Adult;
import io.emalina.studentorder.domain.Person;
import io.emalina.studentorder.domain.StudentOrder;


public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        //buildStudentOrder(22);
        long ans = saveStudentOrder(so);

        System.out.println(ans);

    }

    public static long saveStudentOrder(StudentOrder so) {
        long answer = 199;
        return answer;
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);

        return so;
    }
}
