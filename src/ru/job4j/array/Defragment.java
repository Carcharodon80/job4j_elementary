package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {            //перебирает массив и
            if (array[index] == null) {                                 //находит null
                for (int notNullIndex = index + 1; notNullIndex < array.length; notNullIndex++) {
                    if (array[notNullIndex] != null) {                  //во втором цикле идет дальше по массиву,
                        array[index] = array[notNullIndex];             //находит не null, меняет их местами,
                        array[notNullIndex] = null;                     //выходит из второго цикла
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
