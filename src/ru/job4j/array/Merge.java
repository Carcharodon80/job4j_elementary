package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRight = 0;
        for (int i = 0; i < rsl.length; i++) {                      //начинаем заполнять конечный массив
            if (indexLeft >= left.length) {                         //если левый массив закончился - берем число из правого
                rsl[i] = right[indexRight];
                indexRight++;
            } else if (indexRight >= right.length) {                //если правый массив закончился - берем из левого
                rsl[i] = left[indexLeft];
                indexLeft++;
            } else if (left[indexLeft] <= right[indexRight]) {      //если левое число меньше - берем левое число...
                rsl[i] = left[indexLeft];
                indexLeft++;
            } else {                                                //...иначе - берем правое
                rsl[i] = right[indexRight];
                indexRight++;
            }
        }

        return rsl;
    }
}