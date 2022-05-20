package com.company.Geometry;

public class Cube implements Shape,ThreeDimensionalShape{

    private final int length;
    private final int width;
    private final int height;

    public Cube(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double areaCalculation() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
