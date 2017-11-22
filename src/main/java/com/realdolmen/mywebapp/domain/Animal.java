package com.realdolmen.mywebapp.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * Created by TDKBG57 on 2017-11-22.
 */
public class Animal {

    @Size(min = 1, max = 100, message = "Name too long or short")
    private String name;

    @Size(min = 1, max = 50, message = "Invalid Type")
    private String type;

    @Min(0)
    private int age;

    public Animal() {
    }

    public Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
