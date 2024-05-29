package org.example;

public class Circle extends Shape{
    private int radius;
    public Circle(int radius) throws UnappropriateSideException {
        super( "Circle");
        this.radius = radius;
        if (radius <= 0) throw new UnappropriateSideException();
    }

    @Override
    void printFigureName() {
        System.out.println("Selected figure name is "+ getShapeName());

    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimetr() {
        return 2 * Math.PI * radius;
    }
}
