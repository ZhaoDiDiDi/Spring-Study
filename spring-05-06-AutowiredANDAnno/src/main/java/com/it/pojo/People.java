package com.it.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class People {

    /*@Autowired
    @Qualifier("cat1")*/
    //@Resource //该注解可自动通过id和class查找 默认是byName方式，如果匹配不上，就会byType
    @Resource(name = "cat1")
    private Cat cat;

    /*@Autowired
    @Qualifier("dog1")*/
    //@Resource
    @Resource(name = "dog1")
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
