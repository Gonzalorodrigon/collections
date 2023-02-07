package com.gonzalornunez.arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        //Declaration
        int[] x;

        //Initialization
        //x = {1,2,3,4,5}; DOES NOT WORK.

        //Declaration and Initialization.
        int[] y = {1,2,3,4,5};

        //Normally you declare and create, but initialize it after.
        //z is just a reference variable pointing to the array.
        int[] z = new int[3];
        //If happens that we don't initialize it, the JVM will assign 0 to every element.

        z[0] = 10;
        z[1] = 20;
        z[2] = 30;

        for (int element : z) {
            System.out.println(element);
        }

        int[][] a = new int[2][];

        //If we don't assign anything to a 2D array, it will hold null.
        System.out.println(a[0]); //This is because it's not an integer, but a 1D array.

        //Even tho this is "technically" an int, it will throw a NullPointerException.
        //There is no a[0][0] because a[0] is null too.
        //System.out.println(a[0][0]);

        a[0] = new int[2];

        //This will be initialized to 0, given that a[0] is no longer null.
        System.out.println(a[0][0]);

        //Declaration and Initialization of a 2D array.
        int[][] cd = {{1,2,3},{4,5,6,7}};

        for (int[] array : cd) {
            for (int element : array) {
                System.out.println(element);
            }
        }

        //Only 1D arrays will hold actual elements.
        //A 2D array will hold only object references of the 1D array.
    }
}
