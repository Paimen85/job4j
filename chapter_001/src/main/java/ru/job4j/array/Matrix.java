package ru.job4j.array;
/**
 * @author Evgeny Baranov (evgeni.baranov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Matrix {
    /**
     * Выводит таблицу умножения.
     * @param size размер массива.
     * @return готовая таблица.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }
        return table;
    }
}