package org.example;

public class Rectangle extends Shape {
private int width;
private int length;

    public Rectangle(int width, int length) throws UnappropriateSideException {
        super("Rectangle");
        this.length = length;
        this.width = width;
        if (length <= 0 || width <= 0) throw new UnappropriateSideException();
    }

    @Override
    void printFigureName() {
        System.out.println("Selected figure is " + getShapeName());
    }

    @Override
    double calculateArea() {
        return width * length;
    }

    @Override
    double calculatePerimetr() {
        return 2 * (width + length);
    }
}
