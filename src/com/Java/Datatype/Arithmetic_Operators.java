package com.Java.Datatype;

public class Arithmetic_Operators {
    public static void main(String[] args) {

        System.out.println("|-|-|-|-------------------------------------------|-|-|-|");
        System.out.println("Arithmetic Operators");
        System.out.println("|-----------------------------|");
        int a = 5;
        int i = 3;
        int b = 5 + 10;
        short c = 15 - 10;
        long d = 9876543210L % 9;
        float e = 123456789.0F / 1234567890.0F;
        double f = 1234567890.0 * 987654321.0;

        System.out.println("+ :"+b);
        System.out.println("- :"+c);
        System.out.println("% :"+d);
        System.out.println("/ :"+e);
        System.out.println("* :"+f);

        System.out.println("|-|-|-|-------------------------------------------|-|-|-|");
        System.out.println("Bitwise Operators");
        System.out.println("|-----------------------------|");
        System.out.println("AND Operators");
        System.out.println("5 & 3 : "+(a & i));
        System.out.println("Binary: "+Integer.toBinaryString(a & i));

        System.out.println("\nOR Operators");
        System.out.println("5 | 3 : "+(a | i));
        System.out.println("Binary: "+Integer.toBinaryString(a | i));

        System.out.println("XOR Operators");
        System.out.println("5 ^ 3 : "+(a ^ i));
        System.out.println("Binary: "+Integer.toBinaryString(a ^ i));

        System.out.println("NOT Operators");
        System.out.println("~5 ="+(~a));
        System.out.println("Binary: "+Integer.toBinaryString(~a));

        System.out.println("Left shift");
        System.out.println("5 << 1 = "+(a << 1));
        System.out.println("Binary: "+Integer.toBinaryString(a << 1));

        System.out.println("Right Shift");
        System.out.println("5 >> 1 = "+(a >> 1));
        System.out.println("Binary: "+Integer.toBinaryString(a >> 1));

        System.out.println("|-|-|-|-------------------------------------------|-|-|-|");
        System.out.println(" Relational Operators "); // it returns in Boolean
        System.out.println("|-----------------------------|");
        System.out.println( 1 < 2 );
        System.out.println( 1 > 2 );
        System.out.println( 1 != 2 );
    }
}
