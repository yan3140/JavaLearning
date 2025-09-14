package com.test;
import java.util.Scanner;
public class CheckString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char b = 'a';
        int x = 0;
        int y = 0;
        int z = 0;
        for(int j=0;j<a.length();j++){
            b=a.charAt(j);
            if(b>='a'&&b<='z'){
                x++;
            } else if (b>='A'&&b<='Z') {
                y++;
            } else if (b>='0'&&b<='9') {
                z++;
            }
        }
        System.out.println("小写字母个数："+x);
        System.out.println("大写字母个数："+y);
        System.out.println("数字个数："+z);
        }
    }

