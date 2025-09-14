package com.Interface;

public class Cat extends Animal implements Jumpping{
    public Cat(){}
    public Cat(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void jump(){
        System.out.println("猫跳高");
    }

}
