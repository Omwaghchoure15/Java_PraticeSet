package com.codewithharry_Java;

import java.util.Scanner;

public class Ps1 {
    public static void main(String[] args) {
        // Q1();
        // Q2();
        // Q3();
        // Q4();
        // Q5();
        // psQ1();

    }

    public static void Q1() {  // sum three numbers
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i=1;i<=3;i++){
            System.out.println("Enter number "+i+":");
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println("total three number"+sum);
    }

    public static void Q2() {   // Marks of three Subject calculate CGPA
        Scanner sc = new Scanner(System.in);
        int totalGradePoints = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter the Subject : " + i);
           int marks = sc.nextInt();
            int gradePoint = getGradePoint(marks);
            totalGradePoints += gradePoint;
            System.out.println("Grade Point for Subject " + i + ": " + gradePoint);
        }
        float cgpa = (float) totalGradePoints / 3;
        System.out.println("Your CGPA is: " + cgpa);
    }
    public static int getGradePoint(int marks){
        if (marks >= 91 && marks <= 100)
            return 10;
        else if (marks >= 81)
            return 9;
        else if (marks >= 71)
            return 8;
        else if (marks >= 61)
            return 7;
        else if (marks >= 51)
            return 6;
        else if (marks >= 41)
            return 5;
        else
            return 0;
    }

    public static void Q3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String a = sc.next();
        System.out.println("Hello "+a+" Have a nice day");
    }

    public static void Q4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kilometer");
        float a = sc.nextFloat();
        System.out.println("You have travel "+ a*0.62137119 +" miles");
    }

    public static void Q5(){
        Scanner sc = new Scanner(System.in);
        Integer integer = sc.nextInt();
        if (1.99 == integer){
            System.out.println(integer+" This is not Integer" );
        }
        else {
            System.out.println(integer + " This is Integer");
        }
    }

    public static void psQ1(){
        Scanner sc = new Scanner(System.in);
        int total = 0 ;
        int [] array = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the Subject: " + i + " marks out of 100 ");
            array[i] = sc.nextInt();
            total += array[i];
        }
        float per = (float) total /500;
        System.out.println( "Your total marks is "+total+ " and Percentage is : " +per*100+ "%");
    }


}
