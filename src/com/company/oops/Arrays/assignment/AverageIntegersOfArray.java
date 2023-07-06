package com.company.oops.Arrays.assignment;

public class AverageIntegersOfArray {
    public static void main(String[] args) {
        int[] a={2,5,3,9,6};
        int avg=0, i=0, sum=0;
        while(i<a.length){
            sum += a[i];
            i++;
        }
        System.out.println(avg = sum/ a.length);
    }
}
