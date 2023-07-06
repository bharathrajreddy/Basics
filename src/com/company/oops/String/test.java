package com.company.oops.String;

public class test {
    public static void main(String[] args) {
        String s1 = " Hello  ";
        String s2 = "hello";
        String s3 = "HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.contains("l"));
        System.out.println(s1.startsWith("he"));
        System.out.println(s1.endsWith("lo"));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.length());
        System.out.println(s1.trim().length());
        System.out.println(s1.toCharArray());

    }
}
