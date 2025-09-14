package com.MapabcSumCheck;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMaporTreeMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        //用treemap可自动排序
        //TreeMap<Character,Integer> hm = new TreeMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char key = s.charAt(i);
            Integer value = hm.get(key);
            if(hm.get(key)==null){
                hm.put(key,1);
            }else{
                value ++;
                hm.put(key,value);
            }
        }
        StringBuilder sb=new StringBuilder();
        Set<Character> keyset = hm.keySet();
        for(Character key:keyset){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String str = sb.toString();
        System.out.println(str);
    }
}
