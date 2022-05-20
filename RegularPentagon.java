package com.company.Geometry;

public class RegularPentagon implements Shape{

    private double side;
    private double apothemLength;

    public RegularPentagon(double side, double apothemLength) {
        this.side = side;
        this.apothemLength = apothemLength;
    }

    public double getApothemLength() {
        return apothemLength;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double areaCalculation() {
        return ( apothemLength/2.0) * side* apothemLength;
    }
}
