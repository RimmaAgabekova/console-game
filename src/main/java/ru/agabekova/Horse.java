package ru.agabekova;

public class Horse {
    String name;
    double speed;
    double distance;

    public void move(){
        distance += speed*Math.random();
    }
    public void print(){
        for (int i = 0; i < (int) distance; i++) {
            System.out.print(".");
        }
        System.out.println(name);
    }

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

}
