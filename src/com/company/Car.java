package com.company;

import java.util.Locale;

public class Car {
    //characteristics
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        //Some validation
        if (validModel.equals("carrera") || validModel.equals("gti")){
            this.model = model; //setter
        }else{
            this.model = "Unknown";
        }
    }
    public String getModel() {
        return this.model; //getter
    }
}
