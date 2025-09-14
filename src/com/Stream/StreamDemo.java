package com.Stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamDemo {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Address ad1 = new Address("101","武汉","光明街");
        List<Address> l1 = Arrays.asList(ad1);
        Address ad2 = new Address("101","武汉","光明街");
        List<Address> l2 = Arrays.asList(ad2);
        Address ad3 = new Address("102","武汉","解放街");
        List<Address> l3 = Arrays.asList(ad3);
        Address ad4 = new Address("106","南京","中山");
        List<Address> l4 = Arrays.asList(ad4);
        Address ad5 = new Address("108","纽约","自由街");
        List<Address> l5 = Arrays.asList(ad5);
        Student s1 = new Student("张三",18,l1);
        Student s2 = new Student("李四",19,l3);
        Student s3 = new Student("宫七",25,l2);
        Student s4 = new Student("王武",10,l4);
        Student s5 = new Student("赵琉",20,l5);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
//        list.stream()
//                .filter(s -> s.getAge() > 18)
//                .map(s -> s.getName())
//                .forEach(i -> System.out.println(i));
//        list.stream()
//                .filter(s -> s.getAge() > 9)
//                .peek(s -> s.setName(s.getName()+s.getAge()))
//                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
//                .flatMap(s -> s.getAddress().stream())
//                .map(s->s.getCity())
//                .forEach(a->System.out.println(a.getName()));
         Map<String,List<Address>> collect = list.stream()
                .filter(s -> s.getAge() > 17)
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                 .distinct()
                .collect(Collectors.toMap( s->s.getName(),s->s.getAddress()));
         System.out.println(collect);


    }
}
