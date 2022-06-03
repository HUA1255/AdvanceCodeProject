package com.heima.edu.info.manager.service;

import com.heima.edu.info.manager.damain.Teacher;
import com.heima.edu.info.manager.dao.TeacherDao;

public class TeacherService {
    private TeacherDao teacherDao = new TeacherDao();

    public boolean isExistId(String teacherId) {
        return teacherDao.isExistId(teacherId);
    }

    public boolean addTeacher(Teacher teacher) {
        boolean flag =  teacherDao.addTeacher(teacher);
        return flag;
    }

    public boolean updateTeacherID(String id, Teacher teacherId) {
        return teacherDao.updateTeacher(id,teacherId);
    }

    public void findAll() {
        teacherDao.findAll();
    }

    public boolean deleteTeacherById(String id) {
        return teacherDao.deleteTeacherById(id);
    }
}
