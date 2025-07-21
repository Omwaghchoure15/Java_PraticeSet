package com.Java.OOP.Inheritance;

public class Animal {
    void eat (){
        System.out.println("this animal eat food..");
    }
}

class Dog extends Animal {
    void Brak(){
        System.out.println(" Dog bark.");
    }

    @Override
    void eat() {
        System.out.println(" Dog eat.");
    }
}
