package org.Jonas.Class;

public class Car {
    String model;
    int year;


    //constructor
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
   public void printInfo()  {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
   }
}
