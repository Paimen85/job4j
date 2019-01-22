package ru.job4j.loop;
/**
 * @author Evgeny Baranov (evgeni.baranov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Counter {
    /**
     * Возвращает сумму четных чисел.
     * @param  start,second параметры.
     * @return сумма чётных чисел.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (; start <= finish; start++) {
            if (start % 2 == 0) {
                sum = sum + start;
            }
        }
        return sum;
    }
}