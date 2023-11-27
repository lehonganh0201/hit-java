package com;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getPerimeter() {
        return getArea()*getArea()/(4*Math.PI);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", Area= "+ getArea()+
                ", Perimeter="+getPerimeter()+
                '}';
    }
}
