package com.company;

import com.company.Geometry.*;

public class Main {

    public static void main(String[] args) {

        ICalculateArea calculator = new CalculateArea();
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(5, 5, 3);
        Cube cube = new Cube(10,10,10);
        RegularPentagon pentagon = new RegularPentagon(10,10);
        calculator.addShape(pentagon);

        calculator.addShape(circle);
        calculator.addShape(triangle);
        Printer printer = new Printer();
        printer.printTheSumOfAllShapes(calculator.sumsAllShapeArea(),
                calculator.copyShapesList());
    }
}
