package com.InnerClass;

public class Outer {
    private int num1 = 10;
    //成员内部类
    public class Inner1 {
        private int num2 = 20;
        public void show1() {
            System.out.println(num1);
            System.out.println(num2);
        }
    }
    public void method() {
        Inner1 i = new Inner1();
        i.show1();
    }
    public void method2() {
        //在方法里面，局部内部类
        class Inner2 {
            public void show2() {
                System.out.println(num1);
            }
        }
        Inner2 i = new Inner2();
        i.show2();
    }
    public void method3() {
        //匿名内部类，是局部内部类的一种，但它是一个对象
        Inter i = new Inter(){
            public void inter() {
                System.out.println("匿名内部类");
            }
        };
        i.inter();
    }
}
