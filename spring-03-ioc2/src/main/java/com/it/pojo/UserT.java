package com.it.pojo;

public class UserT {
    private  String name;

    public UserT() {
        System.out.println("userT被创建了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}
