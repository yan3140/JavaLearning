package com.test2;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("杜宾犬");
        d.setAge(3);
        System.out.println(d.getName()+","+d.getAge());
        d.SeeDor();
        d.play();
        Cat  c = new Cat("狸花猫",2);
        System.out.println(c.getName()+","+c.getAge());
        c.Catch();
        c.play();
    }
}
