package com.test;
import java.util.Scanner;
public class IDCheck {
    public static void main(String[] args) {
        String ID = "hzauplx";
        String Password = "199418032";
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<100;i++){
            System.out.println("请输入账号");
            String a = sc.nextLine();
            System.out.println("请输入密码");
            String b = sc.nextLine();
            if(i<3) {
                if (a.equals(ID) && b.equals(Password)) {
                    System.out.println("账号密码正确，成功登录");
                    break;
                } else if (!a.equals(ID) || !b.equals(Password)) {
                    System.out.println("密码或账号错误，重新输入");
                    continue;
                }
            }else {
                System.out.println("输入错误三次,不能继续" );
                break;
            }
        }
    }
}
