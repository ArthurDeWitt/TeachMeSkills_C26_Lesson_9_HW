package com.teachmeskills.lesson9.HW.Homework0;

import java.util.Scanner;

public class SquareFigures {
    public static void main(String[] args) {
        System.out.println("Select code of a figure: Rectangle - 1; Circle - 2; Triangle - 3: ");
        Scanner scanner = new Scanner(System.in);
        byte indexOfFigure = scanner.nextByte();

        switch (indexOfFigure) {
            case 1:
                System.out.println("Enter the length of the rectangle");
                double length = scanner.nextDouble();
                System.out.println("Enter the width of the rectangle");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                double rectangleArea = rectangle.calculateArea();
                System.out.println("Square of rectangle is: " + rectangleArea);
                break;

            case 2:
                System.out.println("Enter the value of the circle radius");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                double circleArea = circle.calculateArea();
                System.out.println("Square of circle is: " + circleArea);
                break;

            case 3:
                System.out.println("Enter the first side of the triangle");
                double side1 = scanner.nextDouble();
                System.out.println("Enter the second side of the triangle");
                double side2 = scanner.nextDouble();
                System.out.println("Enter the third side of the triangle");
                double side3 = scanner.nextDouble();
                Triangle triangle = new Triangle(side1, side2, side3);
                double triangleArea = triangle.calculateArea();
                System.out.println("Square of triangle is: " + triangleArea);
                break;

            default:
                System.out.println("Wrong code of figure");
        }
    }
}
