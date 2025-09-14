package com.Exception;

public class Teacher {
    public void checkScores(int a) throws ScoreException {
        try {
            if (a < 0 || a > 100) {
                throw new ScoreException("分数应该在0-100之间");
            } else {
                System.out.println("分数正常");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
