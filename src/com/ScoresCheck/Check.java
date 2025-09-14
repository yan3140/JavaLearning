package com.ScoresCheck;

import java.util.Comparator;
import java.util.TreeSet;

public class Check {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num= s2.getSum()- s1.getSum();//s2.getMath()+ s2.getChinese()- s1.getChinese()- s1.getMath();
                int num2 = num == 0 ? s2.getMath() - s1.getMath() : num;
                int num3 = num2 == 0 ? s2.getName().compareTo(s1.getName()) : num2;
                return num3;
            }
        });
        Student s1 = new Student("张三",100,99);
        Student s2 = new Student("李四",78,99);
        Student s3 = new Student("王武",96,99);
        Student s4 = new Student("赵六",94,99);
        Student s5 = new Student("刘七",99,94);
        Student s6 = new Student("李亮",99,94);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        for(Student x : ts){
            System.out.println(x.getName()+","+x.getMath()+","+x.getChinese()+","+x.getSum());
        }


    }

}
