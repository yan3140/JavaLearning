package com.test;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        int x=1;
        int y=1;
        getMax(x,y);
    }

    public static void getMax(int a,int b) {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b = sc.nextInt();
        if(a> b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

    }
    public static int getMin(int a,int b) {
        return(a<b?a:b);
    }

}
