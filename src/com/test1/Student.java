package com.test1;

public class Student {
    private String name;
    private String age;
    public Student() {}
    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        int num = Integer.parseInt(age);
        if (num < 0 || num > 120) {
            System.out.println("输入错误");
            return;
        }else{
            this.age=age;
        }

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public void doHomework() {
        System.out.println("做作业");
    }
    public void Play() {
        System.out.println("玩");
    }
    public void show() {
        System.out.println(name+","+age);
    }
}
