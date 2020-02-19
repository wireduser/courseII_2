package com.education_wired_.work226;

public class Shape {
    private String color ;
    public double calcArea(){
    return 0.0;
    };

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getSimpleName()+ ": color = " + color;
    }
}
