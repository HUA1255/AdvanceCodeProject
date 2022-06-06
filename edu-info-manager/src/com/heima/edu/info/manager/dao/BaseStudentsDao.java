package com.heima.edu.info.manager.dao;

import com.heima.edu.info.manager.damain.Students;

import java.util.ArrayList;

public interface BaseStudentsDao {

    public abstract boolean addStudents(Students su);

    public abstract Students[] findAllStudents();

    public abstract void delStudentByID(String delStudentID);

    public abstract void updateStudent(String updateStudentId, Students su);

    public abstract int getIndexById(String id);
}
