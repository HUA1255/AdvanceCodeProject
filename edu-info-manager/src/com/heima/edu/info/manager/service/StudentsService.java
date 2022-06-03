package com.heima.edu.info.manager.service;

import com.heima.edu.info.manager.damain.Students;
import com.heima.edu.info.manager.dao.StudentsDao;

public class StudentsService {
    private StudentsDao studentsDao = new StudentsDao();

    public boolean addStudent(Students su) {
        return studentsDao.addStudents(su);
    }

    public boolean isExist(String id) {
        Students[] students = studentsDao.findAllStudents();
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
        Students[] allStudents = studentsDao.findAllStudents();
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
       studentsDao.delStudentByID(delStudentID);
       return true;
    }

    public void updateStudent(String updateStudentId, Students su) {
        studentsDao.updateStudent(updateStudentId,su);
    }
}
