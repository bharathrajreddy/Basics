package com.company.oops.constructors;

public class ConstructorPractice {
    public int i;
    public static void main(String[] args) {

        ConstructorPractice cp = new ConstructorPractice(56);
//        While object creation only when constructor is called, object is created.
//        Constructors is the block of code used for memory allocation during object creation
//        Default or implicit constructor is teh one created by
        System.out.println(cp.i);
    }

    public ConstructorPractice(){
        i=20;
//        1.Constructor name should be class name
//        2.there will be no return type in constructors
//        3.default constructors will be public
//        Constructor defined by developer is Explicit constructor, created by Java is implicit constructor
//        Modifier Static cannot be used for constructor, only public private and protected are allowed modifiers
    }

//    parameter less and parameterised constructors
//    default constructor is always parameterless constructor
    public ConstructorPractice(int a){
        i = a;
    }
//    when explicit constructor is defined, java will not involve in adding default constructor

}
