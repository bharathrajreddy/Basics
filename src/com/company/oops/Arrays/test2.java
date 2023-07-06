package com.company.oops.Arrays;

public class test2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,},
                {7,9}
        };
        for(int[] singDimArr: arr){
            for(int  x: singDimArr){
                System.out.print(x);
            }
            System.out.println();
        }

    }
}
