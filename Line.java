package com.company.Geometry;

public class Line implements Shape{
    @Override
    public double areaCalculation() {
        throw new IllegalStateException("Lines cannot have area");
    }
}
