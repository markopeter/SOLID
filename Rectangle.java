package com.company.Geometry;

public class Rectangle implements Shape{

    private final double width;
    private final double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;

    }

    @Override
    public double areaCalculation() {
        return 0;
    }
}
