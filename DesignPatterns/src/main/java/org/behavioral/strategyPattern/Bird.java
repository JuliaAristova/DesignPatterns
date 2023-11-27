package org.behavioral.strategyPattern;

public class Bird extends Animal{

    public Bird() {
        super();
        setSound("Tweet");
        flyingType = new ItFlies();
    }


}
