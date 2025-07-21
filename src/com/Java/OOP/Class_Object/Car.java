package com.Java.OOP.Class_Object;

public class Car {
    int speed ;
    String model ;
    String color ;

    void Drive(){
        if (speed == 0){
            System.out.println(model + "is not Driving");
        }
        else System.out.println(model + "is Driving..... " + speed + "km ");
    }
}
