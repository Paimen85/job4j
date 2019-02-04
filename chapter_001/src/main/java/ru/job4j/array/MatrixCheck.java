package ru.job4j.array;

/**
 * @author Evgeny Baranov (evgeni.baranov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheck {
    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param data массив.
     * @return проверенный результат.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0, j = data.length - 1; i < data.length; i++,j--) {
                if (data[i][i] != data[0][0] || data[data.length - 1 - j][j] != data[0][data.length - 1]) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}