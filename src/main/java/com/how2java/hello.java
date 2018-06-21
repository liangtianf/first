package com.how2java;

public class hello {
    private String name;

    private int id;

    public hello() {
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

    @Override
    public String toString() {
        return "hello{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
