package com.company.examples;

public class ToLower {
    public static char[] to_lower(char[] A) {
        if(A.length>=1){
            for(int i=0; i<A.length; i++){
                char B = Character.toLowerCase(A[i]);
                A[i] = B;
            }
            return A;
        }
        return A;
    }

    public static void main(String[] args) {
        char[] A = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
        System.out.println(to_lower(A));
    }
}
