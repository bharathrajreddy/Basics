package com.company.oops.Arrays;

public class test1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for(int i=arr.length-1; i>=0; i=i-1){
            System.out.println(arr[i]);
        }
        for(int x :arr){
            System.out.print(x);
        }
    }
}
