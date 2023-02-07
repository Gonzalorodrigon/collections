package com.gonzalornunez.arrays;

public class AnonymousArrays {

    public static void main(String[] args) {

        //We can use anonymous arrays as a parameter.
        //This array does not have a reference variable.
        //Just because we use it right away.
        sum(new int[] {1,2,3,4});
    }

    private static void sum(int[] ints) {
        int result = 0;
        for (int element : ints) {
            result = result + element;
        }
        System.out.println(result);
    }
}
