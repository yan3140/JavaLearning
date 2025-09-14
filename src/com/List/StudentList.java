package com.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<Student> l = new ArrayList<Student>();
        Student s1 = new Student(18,"张三");
        Student s2 = new Student(19,"李四");
        Student s3 = new Student(19,"王武");
        l.add(s1);
        l.add(s2);
        l.add(s3);
        Iterator<Student> i = l.iterator();
        while(i.hasNext()){
            Student s = (Student)i.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        for(int j=0;j<l.size();j++){
            Student s = l.get(j);
            System.out.println(s.getName()+","+s.getAge());
        }
        for(Student x : l){
            System.out.println(x.getName()+","+x.getAge());
        }




    }
}
