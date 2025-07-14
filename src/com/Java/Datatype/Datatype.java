package com.Java.Datatype;

public class Datatype {
    public static void main(String[] args) {

        System.out.println("|-------------------------------------------|");

        System.out.println(" Byte Range ");
        System.out.println("|-----------------------------|");
        byte BYTE = 127;
        System.out.println(" Example of Byte datatype : "+ BYTE );
        System.out.println(" Minimum byte value : " + Byte.MIN_VALUE );
        System.out.println(" Maximum byte value : " + Byte.MAX_VALUE );

        System.out.println("|-------------------------------------------|");

        System.out.println(" SHORT Range ");
        System.out.println("|-----------------------------|");
        short SHORT = 2147;
        System.out.println(" Example of Short datatype: " + SHORT + "L");
        System.out.println(" Minimum Short value : " + Short.MIN_VALUE);
        System.out.println(" Maximum Short value : " + Short.MAX_VALUE);

        System.out.println("|-------------------------------------------|");

        System.out.println(" Int Range");
        System.out.println("|-----------------------------|");
        int INT = 214748561;
        System.out.println(" Example of int datatype: " + INT );
        System.out.println(" Minimum int value : " + Integer.MIN_VALUE );
        System.out.println(" Maximum int value : " + Integer.MAX_VALUE );

        System.out.println("|-------------------------------------------|");

        System.out.println(" Long Range ");
        System.out.println("|-----------------------------|");
        long LONG = 2142255254521421545L;
        System.out.println(" Example of Long datatype: "+LONG);
        System.out.println(" Minimum Long value : " + Long.MIN_VALUE);
        System.out.println(" Maximum Long value : " + Long.MAX_VALUE);

        System.out.println("|-------------------------------------------|");

        System.out.println(" Float Range");
        System.out.println("|-----------------------------|");
        float FLOAT= 123.456789f; // ~7 significant digits
        System.out.println(" Original float Value : " + FLOAT);
        System.out.println(" Smallest positive float value : " + Float.MIN_VALUE);
        System.out.println(" Largest positive float value : " + Float.MAX_VALUE);
        System.out.println(" Smallest negative float value : -" + Float.MIN_VALUE);
        System.out.println(" Largest negative float value : -" + Float.MAX_VALUE);

        System.out.println("|-------------------------------------------|");

        System.out.println(" Double Range");
        System.out.println("|-----------------------------|");
        double DOUBLE= 123.456789012345678; // ~15 significant digits
        System.out.println(" Original Double Value : " + DOUBLE);
        System.out.println(" Smallest positive Double value : " + Double.MIN_VALUE);
        System.out.println(" Largest positive Double value : " + Double.MAX_VALUE);
        System.out.println(" Smallest negative Double value : -" + Double.MIN_VALUE);
        System.out.println(" Largest negative Double value : -" + Double.MAX_VALUE);

        System.out.println("|-|-|-|-------------------------------------------|-|-|-|");

        System.out.println(" Character Range ");
        System.out.println("|-----------------------------|");
        System.out.println(" Minimum value : " + (int) Character.MIN_VALUE );
        System.out.println(" Maximum value : " + (int) Character.MAX_VALUE );
        System.out.println((char) 10084);
    }
}
