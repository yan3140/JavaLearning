package com.Interface;

public class AnimalDemo {
    public static void main(String[] args) {
        //Animal父类向上转型无法使用接口,若父类继承接口则可使用
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(2);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
//        a.jump();
        Jumpping j = new Cat();
        j.jump();
        //直接使用Cat构造可同时使用Animal父类和Jumpping接口
        Cat c = new Cat();
        c.eat();
        c.jump();
    }
}
