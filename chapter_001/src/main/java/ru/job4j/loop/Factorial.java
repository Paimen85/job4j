package ru.job4j.loop;
/**
 * @author Evgeny Baranov (evgeni.baranov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    /**
     * Возвращает факториал заданного числа.
     * @param  n параметр.
     * @return факториал.
     */
    public int calc(int n) {

        if (n == 0) {
          return 1;
        }
        int i, fact = 1;
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}