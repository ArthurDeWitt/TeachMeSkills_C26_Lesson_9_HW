package com.teachmeskills.lesson9.HW.homework0;

final class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        if (radius <= 0) {
            System.out.println("Enter positive values");
            return 0;
        }
        return Math.PI * radius * radius;
    }
}