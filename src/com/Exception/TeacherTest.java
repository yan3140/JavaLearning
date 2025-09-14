package com.Exception;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) throws ScoreException {
        Teacher t = new Teacher();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        t.checkScores(a);
        System.out.println("end");
    }
}
