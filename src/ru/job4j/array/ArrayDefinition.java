package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Величина массива ages = " + ages.length);
        String[] surnames = new String[10500];
        System.out.println("Величина массива surnames = " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Величина массива prices = " + prices.length);

        String[] names = new String[4];
        names[0] = "Thor";
        names[1] = "Hulk";
        names[2] = "Iron Man";
        names[3] = "Captain America";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
