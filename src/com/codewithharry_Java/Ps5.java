package com.codewithharry_Java;

import java.util.Scanner;

public class Ps5 {
    public static void main(String[] args) {
        //Q1();
        //Q2();
        //Q3();
        //Q4();
        //Q5();
        //Q6();
        //Q7();
        Q8();
    }
    public static void Q1(){
        for (int i = 5; i > 0 ;i--){
            System.out.print("\n");
            for (int j = 0; j < i;j++){
                System.out.print(" * ");
            }
        }
    }
    public static void Q2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int even = sc.nextInt();
        int sum = even%2;
        while (sum == 0){
            System.out.println( even +" This is even number ");
            break;
        }
        sc.close();
    }
    public static void Q3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to create a table : ");
        int sum = sc.nextInt();
        for (int i = 1;i<=10;i++){
            System.out.println(sum + " * "+ i +" = " + sum*i);
        }
        sc.close();
    }
    public static void Q4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to create a table : ");
        int sum = sc.nextInt();
        for (int i = 10;i>=1;i--){
            System.out.println(sum + " * "+ i +" = " + (sum*i));
        }
        sc.close();
    }
    public static void Q5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for factorial : ");
        int num = sc.nextInt();
        int fact = 1 ;
        for (int i = num ; i >= 1 ; i--){
            fact *= i ;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
    public static void Q6(){
        int a = 5;
        while (a>=0){
            System.out.println(a);
            a--;
        }
    }
    public static void Q7(){
        int a = 1;
        while (a>=0){
            System.out.println(a);
            a--;
        }
    }
    public static int Q8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for multiplication of 8 : ");
        int sum = sc.nextInt();
        int a = 8;
        for (int i = 10;i>=1;i--){
            System.out.println(sum + " * "+ a +" = " + (sum*a));
        }
        return -1;
    }

}
