package com.heima.edu.info.manager.control;

import com.heima.edu.info.manager.damain.Teacher;
import com.heima.edu.info.manager.dao.TeacherDao;
import com.heima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherControl {
    private TeacherService teacherService = new TeacherService();
    private Scanner sc = new Scanner(System.in);

    public void start(){
        teacherLoop:
        while (true) {
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    // System.out.println("添加老师");
                    addTeacher();
                    break;
                case "2":
                    // System.out.println("删除老师");
                    deleteTeacherById();
                    break;
                case "3":
                    // System.out.println("修改老师");
                    updateTeacher();
                    break;
                case "4":
                    // System.out.println("查看老师");
                    findAllTeacher();
                    break;
                case "5":
                    System.out.println("感谢您使用老师管理系统, 再见!");
                    break teacherLoop;
                default:
                    System.out.println("您的输入有误, 请重新输入");
                    break;
            }
        }
    }

    public void addTeacher(){
        System.out.println("请输入老师的ID：");
        String teacherId;
        while(true){
            teacherId = sc.next();
            boolean flag = teacherService.isExistId(teacherId);
            if(flag){
                System.out.println("此ID已经存在，请重新输入！");
            }else break;
        }
        Teacher teacher = inputInfo(teacherId);
        boolean flag =  teacherService.addTeacher(teacher);
        if (flag){
            System.out.println("添加老师信息成功！");
        }else System.out.println("添加失败！");
    }
    public void deleteTeacherById(){
        System.out.println("请输入要删除的老师ID：");
        String id =sc.next();
        boolean flag = teacherService.deleteTeacherById(id);
        if (flag){
            System.out.println("删除成功！");
        }else System.out.println("删除失败！");
    }
    public void updateTeacher(){
        System.out.println("请输入老师的ID：");
        String teacherId;
        boolean flag;
        while (true){
            teacherId = sc.next();
            if (teacherService.isExistId(teacherId)) {
                Teacher teacher =  inputInfo(teacherId);
                flag = teacherService.updateTeacherID(teacherId,teacher);
                break;
            }
            else {
                System.out.println("此ID不存在,请重新输入！");
            }
        }
        if (flag){
            System.out.println("修改老师信息成功！");
        }else System.out.println("修改失败！");

    }
    public void findAllTeacher(){
        teacherService.findAll();
    }
    public Teacher inputInfo(String teacherId){
        System.out.println("请输入老师的姓名：");
        String name = sc.next();
        System.out.println("请输入老师的年龄：");
        String age = sc.next();
        System.out.println("请输入老师的生日：");
        String birthday = sc.next();
        Teacher teacher = new Teacher();
        teacher.setID(teacherId);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setBirthday(birthday);
        return teacher;
    }
}
