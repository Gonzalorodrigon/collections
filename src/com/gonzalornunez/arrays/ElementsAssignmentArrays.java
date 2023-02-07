package com.gonzalornunez.arrays;

public class ElementsAssignmentArrays {

    public static void main(String[] args) {

        //Primitive arrays
        int[] a = new int[2];
        float[] b = new float[3];
        byte[] c = new byte[4];
        short[] d = new short[5];
        char[] e = new char[6];
        long[] f = new long[7];
        double[] g = new double[8];

        //Object arrays
        //Can store Object class and it's child/sub classes.
        //Default initial value is null.
        Object[] objects = new Object[2];
        objects[0] = new Object();
        objects[1] = new String();

        //Abstract class type arrays
        //Abstract class arrays cannot hold abstract classes
        //This is because we cannot create a Number Object.
        //Only it's child/sub classes objects.
        //Default initial value is null.
        Number[] numbers = new Number[2];
        numbers[0] = new Integer(1);
        numbers[1] = new Byte("2");

        //Interface type arrays
        //Interface class arrays cannot hold interface classes
        //This is because we cannot create a Runnable Object.
        //Only classes that implements this interface.
        //Default initial value is null.
        Runnable[] runnables = new Runnable[5];
        runnables[0] = new Thread();

    }
}
