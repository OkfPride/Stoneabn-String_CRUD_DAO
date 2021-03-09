/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.springmvc.springcrumdao.Model;

import javax.validation.constraints.*;

/**
 *
 * @author JavaDev
 */
public class Person {

    public Person() {
    }
    @NotEmpty(message = "CANT be empty")
    @Size(min = 1, max = 30, message = "should be in bounds 1-30")
    private String name;

    private int id;

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", id=" + id + ", age=" + age + ", email=" + email + '}';
    }

    @Min(value = 0, message = "cant be <0")
    private int age;
    @Email(message = "shoud be a email vaild form")
    @NotEmpty(message = "CANT be empty")
    private String email;

    public Person(String name, int id, int age, String email) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
