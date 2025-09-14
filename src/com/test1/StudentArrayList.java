package com.test1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {
    public static void main(String[] args) {


        ArrayList<Student> al = new ArrayList<Student>();
//        Author s1 = new Author("张三", "18");
//        Author s2 = new Author("李四", "20");
//        Author s3 = new Author("王武", "19");
//        al.add(s1);
//        al.add(s2);
//        al.add(s3);
//        Scanner sc = new Scanner(System.in);
//

        for (int j = 0; j < 3; j++) {
            addStudent(al);
        }
        for (int i = 0; i < al.size(); i++) {
            Student s = al.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }

    public static void addStudent(ArrayList<Student> al) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String age = sc.nextLine();
        Student s = new Student(name, age);
        al.add(s);
    }
}
