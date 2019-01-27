package ru.job4j.array;
/**
 * @author Evgeny Baranov (evgeni.baranov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
 public class Square {
    /**
     * Заполняет массив числами от 1 до bound возведенными в квадрат.
     * @param  bound параметры.
     * @return результат.
     */
     public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (i + 1) * (i + 1);
        }
        return rst;
     }
 }