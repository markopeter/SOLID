package com.company.Geometry;

public class Square implements Shape{

    private final double oneSide;

    public Square(double oneSide) {
        this.oneSide = oneSide;
    }

    @Override
    public double areaCalculation() {
        return oneSide * oneSide;
    }

}
