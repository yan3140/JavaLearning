package com.test;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        //add和remove输出Boolean类型结果
        System.out.println(a.add("python"));
        a.add("java");
        a.add("c#");
        a.remove("python");
        a.remove(1);

        a.add("c++");
        System.out.println(a);
        //index处添加元素，其他元素后移
        a.add(1,"go");
        //更改元素，并返回被更改的元素
        String set=a.set(2,"python");
        System.out.println("被更改的元素是"+set);
        //get获取index处的元素
        String b=a.get(1);
        int c=a.size();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
