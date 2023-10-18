package com.liaoxuefeng.hCollection.cMap;

import java.util.Objects;

/**
 * @autoer Alex
 * @since: 2020/6/10 21:19
 * @Descprition:
 */
public class Student {
    private String name;
    private Integer score;

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) &&
                Objects.equals(getScore(), student.getScore());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getScore());
    }
}
