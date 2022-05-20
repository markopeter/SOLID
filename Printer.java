package com.company.Geometry;

import java.util.List;

public class Printer {
    public void printTheSumOfAllShapes(int sum, List<Object> shapes){
        System.out.println("Shapes in the collection: ");
        for(Object object: shapes){
            System.out.print(object);
            System.out.println("");
        }
        System.out.println("The sum of these shapes areas : ");
        System.out.println(sum);
    }
}
