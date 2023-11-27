package org.behavioral.strategyPattern;

public class AnimalTest {

    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweety.tryToFly());

        Animal flyingDog = new Dog();
        flyingDog.setFlyingAbility(new ItFlies());
        System.out.println("Flying dog: " + flyingDog.tryToFly());

    }
}
