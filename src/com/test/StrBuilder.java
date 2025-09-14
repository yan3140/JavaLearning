package com.test;

public class StrBuilder {
    public static void main(String[] args) {
//        //StringBuilder 到 String
//        StringBuilder sb1 = new StringBuilder();
//        sb1.append("app").append("aop").append("1235");
//        String s1 = sb1.toString();
//        System.out.println(s1);
//
//        //String 到 StringBuilder
//        String s2 = "appsm";
//        StringBuilder sb2 = new StringBuilder(s2);
//        System.out.println(sb2  );
        char[] a={'a','b','c','d','e','f'};
        String s = ArrayToString(a);
        System.out.println(s);

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
