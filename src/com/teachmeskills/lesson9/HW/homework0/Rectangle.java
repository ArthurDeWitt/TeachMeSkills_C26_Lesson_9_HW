package com.teachmeskills.lesson9.HW.homework0;

final class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        if (length <= 0 || width <= 0) {
            System.out.println("Enter positive values");
            return 0;
        }
        return length * width;
    }
}
