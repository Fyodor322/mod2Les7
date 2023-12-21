package com.example.mod2les7;

public class Aircraft implements consumptionAndTime{

    int capacity;
    int maxSpeed;
    double consumption;
    int distance;

    public Aircraft(int capacity, int maxSpeed, double consumption) {
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.consumption = consumption;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double consumption(){
        return distance / maxSpeed * consumption;
    }
    public float timeHours(){
        return distance / maxSpeed;
    }
}
