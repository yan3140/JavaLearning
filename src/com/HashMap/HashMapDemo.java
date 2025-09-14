package com.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Student s1 =  new Student("张三",18);
        Student s2 =  new Student("李赛",18);
        Student s3 =  new Student("王武",18);
        Student s4 =  new Student("赵琉",18);
        HashMap<String,Student> hm = new HashMap<String,Student>();
        hm.put("101",s1);
        hm.put("102",s2);
        hm.put("103",s3);
        hm.put("104",s4);
        Set<String> keyset = hm.keySet();
        for(String key:keyset){
            Student s = hm.get(key);
            System.out.println(key+","+s.getName()+","+s.getAge());
        }
        System.out.println("----------");
        Set<Map.Entry<String, Student>> me = hm.entrySet();
        for (Map.Entry<String, Student> e:me ){
            String name = e.getValue().getName();
            int age = e.getValue().getAge();
            System.out.println(e.getKey()+","+name+","+age);
        }



    }
}
