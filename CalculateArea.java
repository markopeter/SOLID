package com.company.Geometry;

import java.util.ArrayList;
import java.util.List;

public class CalculateArea implements ICalculateArea {

    private List<Shape> shapeCollection = new ArrayList<>();
    @Override
    public List<Object> copyShapesList(){
        return List.copyOf(shapeCollection);
    }

    @Override
    public void addShape(Shape shape){
        shapeCollection.add(shape);
    }

    @Override
    public int sumsAllShapeArea(){
        int sumOfAllShapeArea = 0;
        for (int i = 0; i < shapeCollection.size(); i++) {
            Shape shape = shapeCollection.get(i);
            sumOfAllShapeArea+= shape.areaCalculation();
        }
        return sumOfAllShapeArea;
    }



}
