package com.HashSet;

import java.util.HashSet;

public class StudentDemo {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student("张三",19);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("王武",19);
        Student s4 = new Student("张三",19);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        for(Student x : set){
            System.out.println(x.getName()+","+x.getAge());
        }
    }
}
