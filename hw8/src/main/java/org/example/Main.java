package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnappropriateSideException {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        Shape shape = null;
        while (flag){
            System.out.println("Choose the figure below:");
            System.out.println("-------------------------");
            String figures = """
                1. Quad
                2. Circle
                3. Rectangle
                4. Diamond
                5. Triangle
                6. Exit
                """;
            System.out.println(figures);
            String shapeName = scanner.nextLine();
try {
    switch (shapeName){
        case ("1") -> {
            System.out.println("Enter the side length of the quad:");
            int side = scanner.nextInt();
            scanner.nextLine();
            shape = new Quad(side);
        }
        case ("2") ->{
            System.out.println("Enter the radius of circle");
            int radius = scanner.nextInt();
            scanner.nextLine();
            shape = new Circle(radius);
        }
        case ("3") -> {
            System.out.println("Enter the width of rectangle");
            int width = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the length of rectangle");
            int length = scanner.nextInt();
            scanner.nextLine();
            shape = new Rectangle(width, length);
        }
        case ("4") -> {
            System.out.println("Enter the side of diamond");
            int side = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the first diagonal");
            int diagonal1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the second diagonal");
            int diagonal2 = scanner.nextInt();
            scanner.nextLine();
            shape = new Diamond(side, diagonal1, diagonal2);
        }
        case ("5") -> {
            System.out.println("Enter the first side of triangle");
            int side1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the second side of triangle");
            int side2 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the third side of triangle");
            int side3 = scanner.nextInt();
            scanner.nextLine();
            shape = new Triangle(side1, side2, side3);
        }
        case ("6") -> flag = false;
        default -> System.out.println("Unknown figure type");
    }
    if (shape != null ){
        shape.printFigureName();
        System.out.println("Area: " +shape.calculateArea());
        System.out.println("Perimetr: " + shape.calculatePerimetr());
    }
} catch (UnappropriateSideException e){
    System.out.println(e.getMessage());
}


        }





    }
}