package com.Polymorphism;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
    public void playGame() {
        //由于父类没有这一方法，向上转型后无法使用
        System.out.println("玩耍");
    }
}
