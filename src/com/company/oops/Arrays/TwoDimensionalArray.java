package com.company.oops.Arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TwoDimensionalArray {
//    if columns of 2d array are equal it is multidimensional array
//    if columns of 2d array are not equal it is jagged array

    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        arr[0][0] = 1;
        arr[0][1] = 2;

        arr[1][0] = 2;
        arr[1][1] = 2;

        arr[2][0] = 2;
        arr[2][1] = 2;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int[][] arr1 = {{1,2},{3,4},{5,6}};
        int[][] arr2 = new int[][] {{1,2},{3,4},{5,6}};
        int[][] arr3 = new int[3][2];
        arr3[0] = new int[] {1,2};
        arr3[1] = new int[] {3,4};
        arr3[2] = new int[] {5,6};
        for(int i=0; i< arr3.length; i++){
            for(int j=0; j<arr3[i].length;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
}
}

