package com.Java.OOP.Polymorphism;

class Animal {
    void Sound (){
        System.out.println(" Animal make sound....");
    }
}

class Dog extends Animal {
    void Sound(){
        System.out.println(" Dog bark'.....");
    }
}
class Cat extends Animal{
    void Sound(){
        System.out.println(" Cat meows'.....");
    }
}
public class RunTime { // RunTime Polymorphism
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.Sound(); // Dog
        animal2.Sound(); // Cat
    }
}
