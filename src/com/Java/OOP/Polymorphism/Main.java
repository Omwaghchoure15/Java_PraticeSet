package com.Java.OOP.Polymorphism;

class Calculater {
    int add(int a ,int b){
        return a + b;
    }
    int add (int a ,int b ,int c){
        return  a + b + c;
    }
}

class Printer {
    void print( String s ){
        System.out.println("String : " + s);
    }
    void print(int num){
        System.out.println("int : " + num);
    }
    void print(double d){
        System.out.println("Double : " + d);
    }
}
public class Main {
    public static void main(String[] args) {
        Calculater calculater = new Calculater();
        System.out.println(calculater.add(15,5)); // 20
        System.out.println(calculater.add(5,10,15)); // 30

        Printer printer = new Printer();
        printer.print("Hello world");
        printer.print(15);
        printer.print(12.0000);

    }
}
