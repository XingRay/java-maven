package com.xingray.java.maven.core.model;

public class FileSet {
    private String directory;

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @Override
    public String toString() {
        return "FileSet{" +
                "directory='" + directory + '\'' +
                '}';
    }
}
