package com.company.Geometry;

public class Circle implements Shape{

    public final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return " Circle ";}

    @Override
    public double areaCalculation() {
        return Math.PI * Math.pow(radius, 2);
    }


    public int getRadius() {
        return radius;
    }
}
