package com.example.admin.customadapter;

/**
 * Created by Admin on 15-09-2016.
 */
public class Student {
    private String name;
    private String phone;

    public Student(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
