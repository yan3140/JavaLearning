package com.test;

public class FindSame {
    public static void main(String[] args) {
        char [] a={'a','b','c','d','e'};
        char [] b={'a','b','c','d'};
        boolean f=find(a,b);
        System.out.println(f);
    }
    public  static boolean find(char [] a,char [] b){
        int i=0;
        int j=0;
        if(a.length!=b.length){
            return false;
        }
        for(i=0;i<a.length;i++){
                if(a[i]==b[i]){
                    continue;
                }else if(a[i]!=b[i]){
                    return false;
                }
        }
        return true;
    }
}
