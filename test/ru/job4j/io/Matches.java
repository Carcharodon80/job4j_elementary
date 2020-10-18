package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        int tour = 1;
        while (matches > 0) {
            if (tour % 2 != 0) {
                System.out.println("На столе " + matches + " спичек. Игрок 1, возьмите от 1 до 3 спичек.");
            } else {
                System.out.println("На столе " + matches + " спичек. Игрок 2, возьмите от 1 до 3 спичек.");
            }
            int count = Integer.valueOf(input.nextLine());
            if (count < 1 || count > 3) {
                System.out.println("Ошибка. Надо взять от 1 до 3 спичек");
                continue;
            }
            matches -= count;
            tour++;
        }
        System.out.println("Игра окончена.");
        if (tour % 2 == 0) {
            System.out.println("Игрок 1 выиграл");
        } else {
            System.out.println("Игрок 2 выиграл");
        }
    }
}
