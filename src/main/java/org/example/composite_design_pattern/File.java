package org.example.composite_design_pattern;

public class File {
    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void ls(){
        System.out.println("file name "+fileName);
    }
}
