package com.anjali.core.core.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private long id;
    private String name;
    private int testScore;
    public long getId() {
        return id;
    }
    public Student() {
        this.id = 0;
        this.name = null;
        this.testScore = 0;
    }

    public Student(long id, String name, int testScore) {
        this.id = id;
        this.name = name;
        this.testScore = testScore;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }

}
