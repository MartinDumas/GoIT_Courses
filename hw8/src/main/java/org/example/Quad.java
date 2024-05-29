package org.example;

public class Quad extends Shape{
    private int side;

    public Quad(int side) throws UnappropriateSideException {
        super("Quad");
        this.side = side;
        if (side <= 0){
            throw new UnappropriateSideException();
        }
    }

    @Override
    void printFigureName() {
        System.out.println("Selected figure is " + getShapeName());

    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimetr() {
        return 4 * side;
    }


}
