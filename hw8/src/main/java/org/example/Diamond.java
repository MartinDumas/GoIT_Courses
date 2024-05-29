package org.example;

public class Diamond extends Shape{
    private int side;
    private int diagonal1;
    private int diagonal2;

    public Diamond(int side, int diagonal1, int diagonal2) {
        super("Diamond");
        this.side = side;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    void printFigureName() {
        System.out.println("Selected figure is " + getShapeName());
    }

    @Override
    double calculateArea() {
        return (diagonal2 * diagonal1) / 2;
    }

    @Override
    double calculatePerimetr() {
        return 4 * side;
    }
}
