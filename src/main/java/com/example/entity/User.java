package com.example.entity;

import org.springframework.core.env.PropertySource;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class User implements Iterable<User> {


    private String name;
    private String passwd;
    private Grade grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Iterator<User> iterator() {
        return null;
    }

    public void forEach(Consumer<? super User> action) {

    }

    public Spliterator<User> spliterator() {
        return null;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
