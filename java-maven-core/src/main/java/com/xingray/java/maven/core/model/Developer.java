package com.xingray.java.maven.core.model;

public class Developer extends Contributor {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id='" + id + '\'' +
                '}';
    }
}
