package com.Java.OOP.Class_Object;

public class Test { // extends Car
    public static void main(String[] args) {

        Car myCar = new Car(); // create Object of Car Class
        myCar.speed = 160;
        myCar.model = " Toyota Fortuner ";
        myCar.color = "White";
        myCar.Drive();
    }
}
