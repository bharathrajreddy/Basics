package com.company.oops.Arrays.assignment;
import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoArrays {
//    public static void main(String[] args)
//    {
//        int[] firstArray = {23,45,12,78,4,90,1};        //source array
//        int[] s1 = {1,1,1,1};
//        int[] secondArray = {77,11,45,88,32,56,3};  //destination array
//        int[] s2 = {2,2,2,2,2};
//        int fal = firstArray.length;        //determines length of firstArray
//        int sal = secondArray.length;   //determines length of secondArray
//        int[] result = new int[fal + sal];  //resultant array of size first array and second array
//
//        System.arraycopy(firstArray, 0, result, 0, fal);
//        System.arraycopy(secondArray, 0, result, fal, sal);
//        System.out.println(Arrays.toString(result));    //prints the resultant array
//    }
    public static void main(String[] args) {
        String[] s1 = {"Chai", "coffee"};
        String[] s2 = {"milk","water","coke"};
//        int[] s1 = {1,1,1,1};
//        int[] s2 = {2,2,2,2,2};

        String[] s3 = new String[s1.length+s2.length];
//        int[] s3 = new int[s1.length+s2.length];

        System.out.println(Arrays.toString(s3));
    }

}
