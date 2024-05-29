package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Shape {
    private String shapeName;

   abstract void printFigureName();
    abstract double calculateArea();
    abstract double calculatePerimetr();
}
