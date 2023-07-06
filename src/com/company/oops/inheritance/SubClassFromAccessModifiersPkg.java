package com.company.oops.inheritance;

import com.company.oops.accesssmodifiers.Student;

public class SubClassFromAccessModifiersPkg extends Student {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.rollNo);
        s.printRollNumber();
    }
}
