package io.emalina.studentorder;

import io.emalina.studentorder.domain.Address;
import io.emalina.studentorder.domain.Adult;
import io.emalina.studentorder.domain.Person;
import io.emalina.studentorder.domain.StudentOrder;


public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        buildStudentOrder();
        long ans = saveStudentOrder(so);

        System.out.println(ans);

    }

    private static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        return answer;
    }

    static StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder();
        Person person = new Person();
        Adult husbant = new Adult();
        husbant.getPersonString();
        husbant.setGivenName("Andrey");
        Address address = new Address();
        address.setStreet("Lunacharscogo");
        husbant.setAddress(address);
        so.setHusband(husbant);
        Adult wife = new Adult();
        so.setWife(wife);
        System.out.println(husbant.getPersonString());
        System.out.println(husbant.getAddress().getStreet());
        return so;
    }
}
