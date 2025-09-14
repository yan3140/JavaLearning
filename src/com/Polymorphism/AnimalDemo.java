package com.Polymorphism;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        Animal d = new Dog();
        AnimalOperator ao = new AnimalOperator();
        ao.useAnimal(c);
        ao.useAnimal(d);
        Dog a = (Dog)d;
        a.playGame();
    }
}
