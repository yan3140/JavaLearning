package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class BeatFarmer {
    public static void main(String[] args) {
        String [] a = {"♦","♣","♥","♠"};
        String [] b ={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        ArrayList<String> list1 = new ArrayList<String>();
        for(int i=0;i<b.length;i++){
            for(int j=0;j<a.length;j++){
                list1.add(a[j]+b[i]);
            }
        }
        list1.add("小王");
        list1.add("大王");
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        int n = 0;
            for(String s:list1){
                hm.put(n,s);
                n++;
            }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i= 0;i<list1.size();i++){
            list2.add(i);
        }
        Collections.shuffle(list2);
        TreeSet<Integer> zspoker = new TreeSet<Integer>();
        TreeSet<Integer> lspoker = new TreeSet<Integer>();
        TreeSet<Integer> wwpoker = new TreeSet<Integer>();
        TreeSet<Integer> dppoker = new TreeSet<Integer>();
        for(int i = 0;i<list2.size();i++){
            if(i>=list2.size()-3){
                for(int j= list2.size()-3;j<list2.size();j++){
                    dppoker.add(list2.get(j));
                }
            }else if(i%3==0){
                zspoker.add(list2.get(i));
            } else if (i%3==1) {
                lspoker.add(list2.get(i));
            }else if(i%3==2){
                wwpoker.add(list2.get(i));
            }
        }
        System.out.print("张三的牌是：");
        for(Integer m:zspoker){
            System.out.print(hm.get(m)+" ");
        }
        System.out.println();
        System.out.print("李四的牌是：");
        for(Integer m:lspoker){
            System.out.print(hm.get(m)+" ");
        }
        System.out.println();
        System.out.print("王武的牌是：");
        for(Integer m:wwpoker){
            System.out.print(hm.get(m)+" ");
        }
        System.out.println();
        System.out.print("底牌是：");
        for(Integer m:dppoker){
            System.out.print(hm.get(m)+" ");
        }




    }
}
