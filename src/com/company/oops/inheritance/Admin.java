package com.company.oops.inheritance;

public class Admin extends Developer{
//    Adding or deleting the product or application
    public void manage(){
        super.read();
//        Suoer is the keyword use to explicitly use anything from Parent class
        write();
        System.out.println("manage Code");
    }
    public void read(){
        System.out.println("Admin read code");
    }
}
