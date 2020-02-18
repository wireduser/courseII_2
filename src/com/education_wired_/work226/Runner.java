package com.education_wired_.work226;

import com.education_wired_.work225.Device;

public class Runner {
    public static void run( ){
        Shape[] shapes = createShapes();
        infoShapes(shapes);
        System.out.println(areaShapes(shapes));
        System.out.println("area Triangle = " + areaShapes(shapes, "Triangle"));
        System.out.println("area Circle = " + areaShapes(shapes, "Circle"));
        System.out.println("area Rectangle = " + areaShapes(shapes, "Rectangle"));
        double[] areas = areaShapesByObj(shapes);
        printAllAreasByObj(areas);
    }

    public static Shape[] createShapes(){
        return new Shape[] {
                new Triangle("red",2,3,4),
                new Triangle("silver",5,3,5),
                new Circle("orange",23),
                new Circle("green",4),
                new Circle("blue",35),
                new Rectangle("white", 23, 34),
                new Rectangle("yellow", 3, 64),
                new Rectangle("black", 2, 74),
                new Rectangle( "gray",3, 77),
        };
    }

    public static void infoShapes(Shape[] shapes){
        for (Shape shape: shapes){
            System.out.println(shape.toString());
        }
    }

    public static  double areaShapes( Shape[] shapes){
        double area = 0;
        for (Shape shape: shapes){
            area += shape.calcArea();
        }
        return area;
    }

    public static  double areaShapes( Shape[] shapes, String shapeName){
        double area = 0;

        for (Shape shape: shapes){
            if (shapeName.equals(shape.getClass().getSimpleName())) area += shape.calcArea();
        }
        return area;
    }

    public static double[] areaShapesByObj (Shape[] shapes){
        double[] areas = new double [3];
        for (Shape shape: shapes){
            if (shape instanceof Circle) areas[0] += shape.calcArea();
            else if (shape instanceof Triangle) areas[1] += shape.calcArea();
            else if (shape instanceof Rectangle) areas[2] += shape.calcArea();
        }
        return areas;
    }

    public static void printAllAreasByObj (double[] areas){
        System.out.println("area Circle = " + areas[0]);
        System.out.println("area Triangle = " + areas[1]);
        System.out.println("area Rectangle = " + areas[2]);
    }



}
