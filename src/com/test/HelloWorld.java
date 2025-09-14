package com.test;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
//        int[] a=new int[100];
        int[] a={1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
//            a[i] = sc.nextInt();
            System.out.print(a[i]+" " );
        }
        System.out.println();
        int max=getMax(a);
        System.out.println("最大值是"+max);
    }
        /*int max=0;
        for(int j=0;j<=5;j++){
            if(a[j]>max){
                max=a[j];
            }
        }
        System.out.println("最大值为"+max);*/
        public static int getMax(int [] a){
            int max=a[0];
            for(int i=0;i<=a.length-1;i++){
                if(a[i]>max){
                    max=a[i];
                }
            }
            return max;

        }


    }


