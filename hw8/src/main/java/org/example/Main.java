package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnappropriateSideException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the figure below:");
        System.out.println("----------------------------------------");
        System.out.println("Quad, Circle, Rectangle, Diamond, Rectangle, Triangle");
        String shapeName = scanner.nextLine();
        Shape shape = null;
        boolean validInput = false;
        while (!validInput){
            try {
                if (shapeName.equalsIgnoreCase("Quad")){
                    System.out.println("Enter the side length of the quad:");
                    int side = scanner.nextInt();
                    shape = new Quad(side);
                    validInput = true;
                } else if (shapeName.equalsIgnoreCase("Circle")) {
                    System.out.println("Enter the radius of circle");
                    int radius = scanner.nextInt();
                    shape = new Circle(radius);
                    validInput = true;
                } else if (shapeName.equalsIgnoreCase("Rectangle")) {
                    System.out.println("Enter the width of rectangle");
                    int width = scanner.nextInt();
                    System.out.println("Enter the length of rectangle");
                    int length = scanner.nextInt();
                    shape = new Rectangle(width, length);
                    validInput = true;
                } else if (shapeName.equalsIgnoreCase("Diamond")) {
                    System.out.println("Enter the side of diamond");
                    int side = scanner.nextInt();
                    System.out.println("Enter the first diagonal");
                    int diagonal1 = scanner.nextInt();
                    System.out.println("Enter the second diagonal");
                    int diagonal2 = scanner.nextInt();
                    shape = new Diamond(side, diagonal1, diagonal2);
                    validInput = true;
                } else if (shapeName.equalsIgnoreCase("Triangle")) {
                    System.out.println("Enter the first side of triangle");
                    int side1 = scanner.nextInt();
                    System.out.println("Enter the second side of triangle");
                    int side2 = scanner.nextInt();
                    System.out.println("Enter the third side of triangle");
                    int side3 = scanner.nextInt();
                    shape = new Triangle(side1, side2, side3);
                    validInput = true;
                } else System.out.println("Unknown figure");
            } catch (UnappropriateSideException e){
                System.out.println(e.getMessage());

            }
        }


        shape.printFigureName();
        System.out.println("Area: " +shape.calculateArea());
        System.out.println("Perimetr: " + shape.calculatePerimetr());


    }
}