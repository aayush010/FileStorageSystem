package com.example.demo.Models;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfo {
    private String name;
    private int age;
    private String dob ;

    public UserInfo(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "com.example.demo.Models.UserInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                '}';
    }
}
