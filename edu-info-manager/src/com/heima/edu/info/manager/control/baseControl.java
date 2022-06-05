 package com.heima.edu.info.manager.control;

import com.heima.edu.info.manager.damain.Students;
import com.heima.edu.info.manager.service.StudentsService;

import java.util.Scanner;

public class baseControl {
    StudentsService studentsService = new StudentsService();
    Scanner sc = new Scanner(System.in);
    // 开启并且展示学生管理系统菜单
    public void start() {
        studentsManagerLoop: while (true) {      // 可以给循环编号，break + 循环名字 跳转到循环下一条指令
            System.out.println("‐‐‐‐‐‐‐‐欢迎来到黑马信息管理系统‐‐‐‐‐‐‐‐");
            System.out.println("请输入您的选择: 1.添加学生 2.删除学生 3.修改学生 4.查看学生信息 5.返回上一级菜单");
            int choice = 0;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (choice) {
                case 0:
                    System.out.println("输入有误，请输入1-5的数字！");
                    break;
                case 1:
                    System.out.println("添加学生");
                    addStudent();
                    break;
                case 2:
                    System.out.println("删除学生");
                    delStudentByID();
                    break;
                case 3:
                    System.out.println("修改学生");
                    updateStudent();
                    break;
                case 4:
                    System.out.println("查看学生信息");
                    findAllStudents();
                    break;
                case 5:
                    System.out.println("返回上一级菜单");
                    break studentsManagerLoop;
                default:
                    System.out.println("您的输入有误，请重新输入:");
                    break;
            }
        }

    }
    public void addStudent(){
        String ID;
        while (true){
            System.out.println("请输入学生ID");
            ID  = sc.next();
            boolean flag = studentsService.isExist(ID);
            if (flag){
                System.out.println("ID已经存在，请重新输入！");
            }else {
                break;
            }
        }
        Students su = inputStudentInfo(ID);

        // 将生成的su对象传给service服务
        boolean result = studentsService.addStudent(su);
        if (result){
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败！");
        }
    }
    public void findAllStudents(){
        Students[] stus = studentsService.findAllStudents();
        if (stus == null){
            System.out.println("查无信息！");
            return;
        }else {
            System.out.println("学号\t\t姓名\t年龄\t生日");
            for (int i =0;i<stus.length;i++){
                if (stus[i]!=null){
                    System.out.println(stus[i].getID()+"\t"+stus[i].getName()+"\t"+stus[i].getAge()+"\t\t"+stus[i].getBirthday());
                }else {
                    continue;
                }
            }
        }

    }
    public void delStudentByID(){
        String delStudentID = inputStudentId();
        boolean flag = studentsService.delStudentByID(delStudentID);
        if(flag){
            System.out.println("删除成功！");
        }
        else {
            System.out.println("删除失败！");
        }
    }
    public void updateStudent(){
        String updateStudentId;
        updateStudentId = inputStudentId();
        Students su = inputStudentInfo(updateStudentId);
        studentsService.updateStudent(updateStudentId,su);
    }

    // 键盘录入学生ID
    public String inputStudentId(){
        String studentID;
        while (true){
            System.out.println("请输入学生ID：");
            studentID = sc.next();
            boolean exist = studentsService.isExist(studentID);
            if (exist){
                break;
            }else {
                System.out.println("您输入的ID不存在，请重新输入！");
            }
        }
        return studentID;
    }

    // 输入某个ID对应的信息，封装为对象
    public Students inputStudentInfo(String studentId){
        return null;
    }
}
