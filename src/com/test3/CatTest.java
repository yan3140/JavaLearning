package com.test3;
//导包操作
import com.test2.Cat;

public class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat("布偶猫",1);
        System.out.println(cat.getName()+","+cat.getAge());
        cat.Catch();
    }
}
