package com.teachmeskills.lesson9.HW.homework0;

final class Triangle extends Figure {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double calculateArea() {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            System.out.println("Enter positive values");
            return 0;
        }
        if (firstSide + secondSide > thirdSide && secondSide + thirdSide > firstSide && firstSide + thirdSide > secondSide) {
            double p = (firstSide + secondSide + thirdSide) / 2;
            return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
        } else {
            System.out.println("Such a triangle doesn't exist");
            return 0;
        }
    }
}
