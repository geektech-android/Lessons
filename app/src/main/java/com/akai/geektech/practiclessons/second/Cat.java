package com.akai.geektech.practiclessons.second;

public class Cat {
    private String name;
    private String gender;

    public Cat() {}

    public Cat(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
