package com.heima.edu.info.manager.dao;

import com.heima.edu.info.manager.damain.Students;

public class StudentsDao {
    private static Students[] arr = new Students[5];

    public boolean addStudents(Students su) {
        int index =-1;
        for (int i =0;i<arr.length;i++){
            if (arr[i]==null){
                arr[i] = su;
                System.out.println("新添加的ID是："+arr[i].getID());
                index = i;
                break;
            }else {
                System.out.println("现有ID是："+arr[i].getID());
            }
        }
        if (index == -1){
            return false;
        }else {
            return true;
        }
    }

    public Students[] findAllStudents() {
        return arr;
    }

    public void delStudentByID(String delStudentID) {
        // 查找ID在容器中的位置索引
        int index = getIndexById(delStudentID);
        // 将对应ID置为null
        arr[index]=null;
    }

    public void updateStudent(String updateStudentId, Students su) {
        int index = getIndexById(updateStudentId);
        arr[index] = su;
        System.out.println("修改成功！");
    }

    public int getIndexById(String id){
        int index = -1;
        for (int i=0;i<arr.length;i++){
            if(arr[i].getID().equals(id)&&arr !=null ){
                index =i;
                break;
            }
        }
        return index;
    }
}
