package com.codewithharry_Java;

import java.util.Scanner;

public class Ps6 {
    public static void main(String[] args) {
        Q1();
    }
    public static void Q1() {
        Scanner sc = new Scanner(System.in);
        float[] sum = new float[5];
        System.out.print("Enter random number for calculate it : ");
        float num = sc.nextFloat();
        for (int i = 0; i > sum.length; i++) {
            num =sum[i];
            System.out.println(num);
        }

    }
}
