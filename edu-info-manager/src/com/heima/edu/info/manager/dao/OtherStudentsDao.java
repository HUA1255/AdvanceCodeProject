package com.heima.edu.info.manager.dao;

import com.heima.edu.info.manager.damain.Students;

import java.util.ArrayList;

public class OtherStudentsDao implements BaseStudentsDao{
    private static ArrayList<Students> students = new ArrayList<>();

    static {
        Students su = new Students("heima001","张三","12","2010-01-01");
        students.add(su);
    }

    public boolean addStudents(Students su) {
        students.add(su);
        return true;
    }

    public Students[] findAllStudents() {
        Students[] stus = new Students[students.size()];
        for (int i = 0;i<students.size();i++){
            stus[i] = students.get(i);
        }
        return stus ;
    }

    public void delStudentByID(String delStudentID) {
        // 查找ID在容器中的位置索引
        int index = getIndexById(delStudentID);
        // 将对应ID置为null
        students.remove(index);
    }

    public void updateStudent(String updateStudentId, Students su) {
        int index = getIndexById(updateStudentId);
        students.set(index,su);     // set有两个参数！！！
        System.out.println("修改成功！");
    }

    public int getIndexById(String id){
        int index = -1;
        for (int i=0;i<students.size();i++){
            if(students.get(i).getID().equals(id)&&students !=null ){
                index =i;
                break;
            }
        }
        return index;
    }
}
