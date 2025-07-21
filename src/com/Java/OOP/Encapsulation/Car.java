package com.Java.OOP.Encapsulation;

public class Car {
     protected int speed ;
     private String model ;
     private String color ;

    public Car( String Color,String Model) {
    this.color = Color;
    this.model = Model;
    }

    public void setSpeed (int Speed){
        if (Speed < 0){
            System.out.println(model + "Not possible....");
        }
        else{
            this.speed = Speed;
            System.out.println(model + " is Driving..... " + speed + "km ");
        }
    }

}
