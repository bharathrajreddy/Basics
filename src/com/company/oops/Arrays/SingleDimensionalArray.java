package com.company.oops.Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        int f[];// first method
        int[] s;//second method
        int[] a = new int[5];// size is created but values are not added
        String[] str = new String[5];
        boolean[] b = new boolean[5];
        Sample[] sam;
        a[0] = 5;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 1;
//        ArrayIndexOutOfBoundException we'll get that when we try to access index more than array Index.
//        for eg array size is 5, we should be acesing from 0-4. if we try to access 5 we'll get array index out of bound exception
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        int i=0;
        while(i<a.length){
            System.out.println(a[i]);
            i++;
        }
        int [] j  = {5,8,5,9,1}; /*or*/ int [] k = new int[] {5,5,6,8,7};
    }
}
