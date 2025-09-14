package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入你需要比较的元素个数");
        int n=sc.nextInt();
        System.out.println("输入你要比较的元素");
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("确认要比较的元素集合为："+ Arrays.toString(a));
        for(int x=0;x<a.length-1;x++){
            for(int y=0;y<a.length-x-1;y++){
                if(a[y]>a[y+1]){
                    int temp=a[y];
                    a[y]=a[y+1];
                    a[y+1]=temp;
                }
            }
        }
        System.out.println("排序后的元素集合为："+Arrays.toString(a));
//        Arrays自带排序
//        int [] b={10,6,7,20,16,13};
//        Arrays.sort(b);
//        System.out.println(Arrays.toString(b));
    }
    public static String ArrayToString(char[] a){
        String s = "";
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i=0;i<a.length;i++){
            if(i==a.length-1){
                sb.append(a[i]);
            }else{
                sb.append(a[i]+", ");
            }
        }
        sb.append(']');
        s = sb.toString();
        return s;
    }
}
