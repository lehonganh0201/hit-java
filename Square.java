package com;

public class Square extends Rectangle {

    public Square(String color, boolean filled, double side) {
        super(color, filled, side,side);
    }

    public Square() {
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public double getArea() {
        return getSide()*4;
    }

    @Override
    public double getPerimeter() {
        return getSide()*getSide();
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + getSide() +
                ", Area= "+ getArea()+
                ", Perimeter="+getPerimeter()+
                '}';
    }
}
