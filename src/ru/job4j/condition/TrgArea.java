package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + c + c) / 2;      //вычисляем полупериметр треугольника
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));    //формула Герона
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}