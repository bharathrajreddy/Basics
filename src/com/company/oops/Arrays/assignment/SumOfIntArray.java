package com.company.oops.Arrays.assignment;

public class SumOfIntArray {
    public static void main(String[] args) {
        int[] i = {2,5,1,9,6};
        int sum = 0;
        for(int j=0; j<i.length; j++){
            sum = sum +i[j];
        }
        System.out.println(sum);
    }
}
