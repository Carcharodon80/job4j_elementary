package ru.job4j.array;

/**
 * Находим индекс массива, если нет - возвращаем -1
 */
public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}