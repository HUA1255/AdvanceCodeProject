package com.heima.edu.info.manager.Factory;

import com.heima.edu.info.manager.dao.BaseStudentsDao;
import com.heima.edu.info.manager.dao.StudentsDao;

public class StudentDaoFactory {
    public static BaseStudentsDao getStudentDao(){
        return new StudentsDao();
    }
}
