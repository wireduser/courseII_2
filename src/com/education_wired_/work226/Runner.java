package com.education_wired_.work226;

import com.education_wired_.work225.Device;

public class Runner {
    public static void run( ){
        System.out.println(  new Shape("red").toString() );
        System.out.println( new Circle(12).toString());
        System.out.println( new Circle(23).calcArea());
        System.out.println( new Rectangle(13,13).toString());
        System.out.println( new Rectangle(13,13).calcArea());
        System.out.println( new Triangle(2,3,4).calcArea());
        Shape[] shapes = createShapes();
        infoShapes(shapes);
        System.out.println(areaShapes(shapes));
        System.out.println("area Triangle = " + areaShapes(shapes, "Triangle"));
        System.out.println("area Circle = " + areaShapes(shapes, "Circle"));
        System.out.println("area Rectangle = " + areaShapes(shapes, "Rectangle"));

        return ;
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

}
