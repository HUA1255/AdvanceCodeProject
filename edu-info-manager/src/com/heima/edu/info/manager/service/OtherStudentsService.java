package com.heima.edu.info.manager.service;

import com.heima.edu.info.manager.damain.Students;
import com.heima.edu.info.manager.dao.OtherStudentsDao;

public class OtherStudentsService {
    private OtherStudentsDao otherStudentsDao = new OtherStudentsDao();

    public boolean addStudent(Students su) {
        return otherStudentsDao.addStudents(su);
    }

    public boolean isExist(String id) {
        Students[] students = otherStudentsDao.findAllStudents();
        boolean flag = false;
        for (int i = 0;i<students.length;i++){
            if ((students[i] != null )&& students[i].getID().equals(id)){
                flag =true ;
                break;
            }
        }
        if (flag){
            return true;
        }else {
            return false;
        }
    }

    public Students[] findAllStudents() {
        Students[] allStudents = otherStudentsDao.findAllStudents();
        boolean flag =false;
        for (int i=0;i<allStudents.length;i++){
            if (allStudents[i]!=null){
                flag = true;
            }
        }
        if (flag){
            return allStudents;
        }else {
            return null;
        }
    }

    public boolean delStudentByID(String delStudentID) {
       otherStudentsDao.delStudentByID(delStudentID);
       return true;
    }

    public void updateStudent(String updateStudentId, Students su) {
        otherStudentsDao.updateStudent(updateStudentId,su);
    }
}
