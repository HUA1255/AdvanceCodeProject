package com.heima.edu.info.manager.damain;

public class Teacher {
    private String ID;
    private String name;
    private String age;
    private String birthday;
    // 空参数构造方法
    public Teacher() {
    }
    // 有参构造方法
    public Teacher(String ID, String name, String age, String birthday) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
