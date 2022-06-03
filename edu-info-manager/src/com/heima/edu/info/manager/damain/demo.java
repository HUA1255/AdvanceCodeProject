package com.heima.edu.info.manager.damain;

public class demo {
    String name;
    String age;
    static String school;

    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr);
    }

    //静态方法只能访问静态的成员
    public static void st(){
//        System.out.println( name + age + school);       //可以看到只有school不报红
    }

    //非静态方法可以访问静态的成员，也可以访问非静态的成员
    public void mt(){
        System.out.println(name + age + school);        //可以看到都是正常不报错的
    }
}
