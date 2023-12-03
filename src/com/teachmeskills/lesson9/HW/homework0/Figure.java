package com.teachmeskills.lesson9.HW.homework0;

/*
Усовершенствовать задание с фигурами
Использовать модификатор Sealed для класса "Фигура".
 */

public sealed class Figure permits Rectangle, Circle, Triangle {
    public double calculateArea() {
        return 0;
    }
}