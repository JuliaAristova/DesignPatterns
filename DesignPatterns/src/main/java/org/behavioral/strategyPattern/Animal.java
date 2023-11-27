package org.behavioral.strategyPattern;

import lombok.Getter;


@Getter

public class Animal {

    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    public Flies flyingType; //composition

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFavFood(String favFood) {
        if (weight > 0)
            this.favFood = favFood;
        else
            System.out.println("Weight must be greater than 0");
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingAbility(Flies flyingType) {
        this.flyingType = flyingType;
    }
}


