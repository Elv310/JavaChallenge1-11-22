package com.company;

public class Car {
    public String make;
    public String model;
    public int mileage;
    public float gasPercent;


    public Car(String make, String model, int mileage, float gasPercent) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasPercent = gasPercent;

    }


    public String getMake() {
        String Car1 = "Honda";
        String Car2 = "BMW";
        String Car3 = "Jag";
        return make;
    }

    public void setMake(String make) {
        String Car1 = "Honda";
        String Car2 = "BMW";
        String Car3 = "Jag";

        this.make = make;
    }

    public String getModel() {
        String Car1 = "Accord";
        String Car2 = "6 Series";
        String Car3 = "F-Type";
        return model;
    }

    public void setModel(String model) {
        String Car1 = "Accord";
        String Car2 = "6 Series";
        String Car3 = "F-Type";
        this.model = model;
    }

    public int getMileage() {
        int Car1 = 100000;
        int Car2 = 54000;
        int Car3 = 93000;

        return mileage;
    }

    public void setMileage(int mileage) {
        int Car1 = 100000;
        int Car2 = 54000;
        int Car3 = 93000;
        this.mileage = mileage;
    }

    public float getGasPercent() {
        float Car1 =  7;
        float Car2 =  18;
        float Car3 =  23;
        return gasPercent;
    }

    public void setGasPercent(float gasPercent) {
        float Car1 =  7;
        float Car2 =  18;
        float Car3 =  23;
        this.gasPercent = gasPercent;
    }
}

