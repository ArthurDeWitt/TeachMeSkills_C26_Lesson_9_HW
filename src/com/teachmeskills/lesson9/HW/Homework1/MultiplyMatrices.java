package com.teachmeskills.lesson9.HW.Homework1;

public class MultiplyMatrices {
    // Implementation of the multiplyMatrices method (thanks to Google)
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        // Create a new matrix of size firstMatrix.length by secondMatrix[0].length to store the result
        int[][] result = new int[firstMatrix.length][secondMatrix[0].length];

        // Use three nested loops to multiply the matrices
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[0].length; j++) {
                for (int k = 0; k < secondMatrix.length; k++) {
                    // Compute each element of the new matrix by summing the products of corresponding elements of the matrices
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        // Return the resulting matrix
        return result;
    }
}