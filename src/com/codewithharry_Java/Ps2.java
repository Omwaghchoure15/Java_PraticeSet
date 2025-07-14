package com.codewithharry_Java;

import java.util.Scanner;

public class Ps2 {
    public static void main(String[] args){
        //Q1();
        //Q2();
        //Q3(15);
        //Q4();
        //Q5();
    }
    public static void Q1(){
       float a =  7 / 4 * 9 /2;
        System.out.println( " a " + a);
    }
    public static void Q2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your grade :");
        int grade = sc.nextInt();
        int key = 8;
        // Encrypt
        int a = grade + key;
        System.out.println("the is encrypt grade "+ a);
        // decrypt
        int b = a - key;
        System.out.println("this is decrypt "+ b);
    }
    public static void Q3(int i){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number for comparison : ");
        int a = sc.nextInt();
        if (i==a){
            System.out.print("Your number is Greater");
        }
        else System.out.print("Your number is less");
    }
    public static void Q4(){
        int a = 5;
        int v = 12;
        int s = 8;
        int u = 9;
        double result = (v * 2 - u * 2) / (2 * a * s);
        System.out.print(result);
    }
    public static void Q5(){
        int a = 7*49/7+35/7;
        int x = 7;
        System.out.print(a);
    }
}
