package com.company.oops.encapsulation;

public class Teacher {
    public static void main(String[] args) {
        Student s = new Student(123);
//        s.isAttended = true;
        s.setStudentAttendance(true);
        s.getStudentAttendance();
    }
}
