package com.gonzalornunez.arrays;

public class VariableAssignments {

    public static void main(String[] args) {

        //We create a new array with "x" reference variable.
        int[] x = new int[2];

        //We create a new reference variable "y" to the same array that "x" points to.
        int[] y = x;

        //Because of that, changes made to "x" will also be visible in "y".
        x[0] = 1;
        System.out.println(x[0]);
        System.out.println(y[0]);

        //And the other way around too.
        y[1] = 2;
        System.out.println(y[1]);
        System.out.println(x[1]);

        //New array with reference variable "a".
        int[] a = {1,2,3,4};
        //New array with reference variable "b".
        int[] b = {6,7,8,9,10};

        System.out.println(a);
        System.out.println(b);

        //Now we assign to "a" the array that "b" points to.
        //Array {1,2,3,4} becomes unreachable and it's ready for the garbage collector to clean it.
        a = b;

        System.out.println(a);

        for (int element : a) {
            System.out.println(element);
        }

        for (int element : b) {
            System.out.println(element);
        }

        String[] strings = new String[5];
        Object[] objects = strings;

        int[] ints = new int[4]; //[I
        //short[] shorts = ints; //[S //No relation with [I
        //short to int has no problem, but short[] to int[] it's impossible.
    }
}
