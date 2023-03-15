package com.xingray.java.maven.core.model;

public class Profile extends ModelBase{
    private String id;

    private Activation activation;

    /**
     * Information required to build the project.
     */
    private BuildBase build;
}
