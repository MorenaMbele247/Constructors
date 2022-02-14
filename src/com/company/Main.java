package com.company;

public class Main {

    public static void main(String[] args) {
        //Same way you declare it in c#
        Car porsche = new Car();
        Car golf7 = new Car();

        porsche.setModel("Carrera");

        System.out.println("Model is " + porsche.getModel());
    }
}
