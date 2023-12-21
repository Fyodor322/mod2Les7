package com.example.mod2les7;

public class Helicopter extends Aircraft{

    public Helicopter(int capacity, int maxSpeed, double consumption) {
        super(capacity, maxSpeed, consumption);
    }

    @Override
    public double consumption(){
        return distance/100 * consumption;
    }
}
