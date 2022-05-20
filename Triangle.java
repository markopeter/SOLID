package com.company.Geometry;

public class Triangle implements Shape{

    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree){
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;

    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    public double getSideThree() {
        return sideThree;
    }

    @Override
    public String toString(){
        return " Triangle ";}

    @Override
    public double areaCalculation() {
        double side = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt( side *(side-sideOne) * (side -sideTwo) * (side-sideThree));
    }
}
