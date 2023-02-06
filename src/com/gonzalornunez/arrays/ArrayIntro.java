package com.gonzalornunez.arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        //... and so on.

        //Use arrays to not do this ↑

        //Size of array is always fixed. Cannot increase or decrease.
        int[] e = new int [1000];

        //Even tho we cannot see it,
        //there is a Class for every primitive type array,
        //that is why we can use de new operator.
        System.out.println(e.getClass().getName());

        //We can set the array length to 0.
        int[] e2 = new int [0];

        //We can even set the array length to a character,
        //that is because it is converted to the ASCII table.
        //types allowed are byte,short,char and int.
        //Those types can all be converted to int, that is why.
        int[] e3 = new int['a'];

        //We can also set the length to a negative int,
        //it won't throw a compilation error but,
        //it will throw NegativeArraySizeException at runtime.
        int[] e4 = new int[-10];

        //Maximum size is: 2147483647
        //Also note that this will take too much memory.
        //Probably will throw OutOfMemory at runtime at some point.
        //There is not enough Heap Memory to allocate that.
        int[] e5 = new int[2147483647];
    }
}
