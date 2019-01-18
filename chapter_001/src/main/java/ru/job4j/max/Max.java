package ru.job4j.max;

/**
 * @author Evgeny Baranov (evgeni.baranov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public  class Max {
    /**
     * Возвращает максимальное число
     * @param  first,second параметры.
     * @return Максимальное число.
     */
    public int max(int first, int second) {
        return first < second ? second : first;
    }

}