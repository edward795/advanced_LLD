package org.example.factory_design_pattern;

public class ShapeFactory {
    Shape getShape(String input){
        switch (input){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
