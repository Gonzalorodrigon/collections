package com.gonzalornunez.arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {

        //Multidimensional arrays are just array of arrays.

        //In the first spare we provide the size of the array.
        int[][] a = new int[3][];
        //2D array ↑

        //So, to add an element to the multidimensional array we just:
        a[0] = new int[15];
        a[1] = new int[20];
        a[2] = new int[1];

        //Always have to fill the base size of the array.
        //Next level sizes are optional.
        int[][][] b = new int[3][][];
        //3D array ↑
        //A 3D array contains 2D arrays.

        //3D Array contains three 2D arrays,
        //first 2D array has size 1, second 2, and third 3.
        //This means that b[0] contains a 2D array,
        //that contains only one 1D array.
        b[0] = new int[1][];

        //The 2D array has an array of 10 elements.
        b[0][0] = new int[10];

        //Giving the 1D array values.
        b[0][0][0] = 1;
        b[0][0][1] = 2;
        b[0][0][2] = 3;
        b[0][0][3] = 4;
        b[0][0][4] = 5;
        b[0][0][5] = 6;
        b[0][0][6] = 7;
        b[0][0][7] = 8;
        b[0][0][8] = 9;
        b[0][0][9] = 10;

        //Then I do the same for the others 2D arrays.

        //Second 2D array has 2 1D arrays.
        b[1] = new int[2][];

        //First 1D Array with length 5.
        b[1][0] = new int[5];

        //Assigning values.
        b[1][0][0] = 1;
        b[1][0][1] = 2;
        b[1][0][2] = 3;
        b[1][0][3] = 4;
        b[1][0][4] = 5;

        //Second 1D array with length 6.
        b[1][1] = new int[6];

        //Assigning values.
        b[1][1][0] = 1;
        b[1][1][1] = 2;
        b[1][1][2] = 3;
        b[1][1][3] = 4;
        b[1][1][4] = 5;
        b[1][1][5] = 6;

        //Third 2D array that has 3 1D arrays.
        b[2] = new int[3][];

        //First 1D array with length 5.
        b[2][0] = new int[5];

        //Assigning values.
        b[2][0][0] = 1;
        b[2][0][1] = 2;
        b[2][0][2] = 3;
        b[2][0][3] = 4;
        b[2][0][4] = 5;

        //Second 1D array with length 4.
        b[2][1] = new int[4];

        //Assigning values.
        b[2][1][0] = 1;
        b[2][1][1] = 2;
        b[2][1][2] = 3;
        b[2][1][3] = 4;

        //Third 1D array with length 3.
        b[2][2] = new int[3];

        //Assigning values.
        b[2][2][0] = 1;
        b[2][2][1] = 2;
        b[2][2][2] = 3;

        for (int[][] b2 : b) {
            System.out.println("2D Array: " + b2.toString() + " has: " + b2.length + " 1D arrays");
            for (int[] b3 : b2) {
                System.out.println("1D array: " + b3.toString() + " has: " + b3.length + " length");
                for (int b4 : b3) {
                    System.out.println("with value: " + b4);
                }
            }
        }
    }
}
