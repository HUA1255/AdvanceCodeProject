package com.heima.edu.info.manager.entry;

import com.heima.edu.info.manager.control.StudentsControl;
import com.heima.edu.info.manager.control.TeacherControl;
import com.heima.edu.info.manager.damain.Teacher;

import java.util.Scanner;

public class infoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("‐‐‐‐‐‐‐‐欢迎来到黑马信息管理系统‐‐‐‐‐‐‐‐");
            System.out.println("请输入您的选择: 1.学生管理 2.老师管理 3.退出");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("学生管理系统");
                    StudentsControl suController = new StudentsControl();
                    suController.start();
                    break;
                case 2:
                    System.out.println("老师管理系统");
                    TeacherControl teacherControl = new TeacherControl();
                    teacherControl.start();
                    break;
                case 3:
                    System.out.println("感谢使用，系统已退出！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入:");
                    break;
            }
        }

    }


}
