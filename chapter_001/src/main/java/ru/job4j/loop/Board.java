package ru.job4j.loop;
/**
 * @author Evgeny Baranov (evgeni.baranov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Board {
    /**
     * Рисует шахматную доску.
     * @param  width, height параметры.
     * @return шахматную доску.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        int i, j;
        for (i = 0; i < height; i++) {
            for (j = 0; j < width; j++) {
                if ((i + j)% 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}