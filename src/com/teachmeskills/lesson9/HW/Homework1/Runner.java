package com.teachmeskills.lesson9.HW.Homework1;

import static com.teachmeskills.lesson9.HW.Homework1.Utils.printMatrix;

public class Runner extends MultiplyMatrices {

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] matrix2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        System.out.println("First matrix: ");
        printMatrix(matrix1);

        System.out.println("Second matrix: ");
        printMatrix(matrix2);

        int[][] result = multiplyMatrices(matrix1, matrix2);

        System.out.println("Result: ");
        printMatrix(result);
    }
}
