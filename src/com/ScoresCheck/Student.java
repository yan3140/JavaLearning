package com.ScoresCheck;

public class Student {
    private int Math;
    private int Chinese;
    private String Name;
    public Student(){}
    public Student(String name,int Math, int Chinese){
        this.Name = name;
        this.Math=Math;
        this.Chinese=Chinese;
    }

    public void setMath(int math) {
        this.Math = math;
    }
    public int getMath() {
        return Math;
    }

    public void setChinese(int chinese) {
        this.Chinese=Chinese;
    }

    public int getChinese() {
        return Chinese;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return Name;
    }
    public int getSum(){
        int sum=getChinese()+getMath();
        return sum;
    }
}
