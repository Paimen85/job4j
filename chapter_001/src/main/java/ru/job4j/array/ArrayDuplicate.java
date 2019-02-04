package ru.job4j.array;

import java.util.Arrays;
/**
 * @author Evgeny Baranov (evgeni.baranov@gmail.com)
 * @version $Id$
 * @since 0.1
 * Обертка над строкой.
 */
public class ArrayDuplicate {
    /**
     * Удаляет одинаковый элемент из массива.
     * @param array массив.
     * @return возвращает новый массив
     */
    public String[] remove(String[] array) {
        int element = array.length;
        for (int out = 0; out < element; out++) {
            for (int in = out + 1; in < element; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[element - 1];
                    element--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, element);
    }
}