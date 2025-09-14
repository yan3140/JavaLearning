package com.AbstractClass;

public abstract class Human {
    //可以有构造方法给子类来访问，但是不能实例化
    private final String city = "北京";
    private int age = 20;
    public Human() {}
    public Human(int age){
        this.age = age;
    }
    public abstract void work();

    public void sleep() {
        System.out.println("晚上休息");
    }
}
