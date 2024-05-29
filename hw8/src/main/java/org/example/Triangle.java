package org.example;

public class Triangle extends Shape{
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        super("Triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    @Override
    void printFigureName() {
        System.out.println("Selected figure is " + getShapeName());
    }

    @Override
    double calculateArea() {
        double p = calculatePerimetr()/2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p -side3));
    }

    @Override
    double calculatePerimetr() {
        return side1 + side2 + side3;
    }
}
