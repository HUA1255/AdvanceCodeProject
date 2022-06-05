package com.heima.edu.info.manager.dao;

import com.heima.edu.info.manager.damain.Teacher;

public class TeacherDao {
    private static Teacher [] teachers = new Teacher[5];

    static {
        Teacher te  = new Teacher("001","Tony","23","1999-01-01");
        teachers[0] = te;
    }

    public boolean isExistId(String teacherId) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i]!=null&&teachers[i].getID().equals(teacherId)) {
                return true;
            }
        }
        return false;
    }

    public boolean addTeacher(Teacher teacher) {
        int index = -1;
        for (int i=0;i<teachers.length;i++){
            if (teachers[i] == null){
                index = i;
                teachers[i] = teacher;
                break;
            }
        }
        if (index == -1){
            return false;
        }else return true;
    }

    public boolean updateTeacher(String id, Teacher teacher) {
        int flag = -1;
        for (int i=0;i<teachers.length;i++){
            if (teachers[i].getID().equals(id)){
                teachers[i] = teacher;
                flag = 1;
                break;
            }
        }
        if (flag==1){
            return true;
        }
        else return false;
    }

    public void findAll() {
        String ID,name,age,birthday;
        for (int i=0;i<teachers.length;i++){
            if (teachers[i]!=null){
                ID =  teachers[i].getID();
                name =teachers[i].getName();
                age = teachers[i].getAge();
                birthday = teachers[i].getBirthday();
                System.out.println(ID+"\t"+name+"\t"+age+"\t"+birthday);
            }
        }
    }

    public boolean deleteTeacherById(String id) {
        int flag = -1;
        for (int i=0;i<teachers.length;i++){
            if (teachers[i].getID().equals(id)){
                teachers[i] = null;
                flag = 1;
                break;
            }
        }
        if (flag==1){
            return true;
        }
        else return false;
    }
}
