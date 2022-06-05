package com.heima.edu.info.manager.control;

import com.heima.edu.info.manager.damain.Students;
import com.heima.edu.info.manager.service.StudentsService;

import java.util.Scanner;

public class otherStudentsControl extends baseControl{

    // 输入某个ID对应的学生信息，封装为学生对象
    public Students inputStudentInfo(String studentId){
        System.out.println("请输入学生的名字：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        String age = sc.next();
        System.out. println("请输入生日：");
        String birthday = sc.next();
        Students su = new Students(studentId,name,age,birthday);
        return su;
    }
}
