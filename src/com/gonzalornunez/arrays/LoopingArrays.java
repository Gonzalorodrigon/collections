package com.gonzalornunez.arrays;

public class LoopingArrays {
    public static void main(String[] args) {

        int[] a = new int[5];

        for (int element : a) {
            System.out.println(element);
        }

        int length = a.length;

        //Always the pointer should be 0, since the index starts at 0.
        for (int i = 0; i < length; i++) {
            a[i] = i+1;
            System.out.println(i);
        }

        int[][] b = new int[2][3];

        for (int[] c : b) {
            for (int d : c) {
                System.out.println(d);
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print("i is: " + i + " and j is: " + j);
                b[i][j] = i+j+1;
                System.out.println(" sum is: "+b[i][j]);
            }
        }
    }
}
