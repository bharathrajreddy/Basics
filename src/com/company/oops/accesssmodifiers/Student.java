package com.company.oops.accesssmodifiers;

public class Student {
//    Class can never be Private
//    Constructor can be private
    public int rollNo = 101;

    public Student(){
        rollNo = 102;
    }
    public void printRollNumber(){
        System.out.println(rollNo);
    }

    private void abc(){
        printRollNumber();
        System.out.println(rollNo);
    }

    public static void main(String[] args) {
        Student s = new Student();
    }

}
