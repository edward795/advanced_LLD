package org.example.composite_design_pattern.ProblemStatement.Solution1WithCompositeDesign;

public class File implements FileSystem{
    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("file name "+fileName);
    }
}
