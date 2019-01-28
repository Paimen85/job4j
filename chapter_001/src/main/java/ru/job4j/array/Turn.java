package ru.job4j.array;
/**
 * @author Evgeny Baranov (evgeni.baranov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Turn {
    public int[] back(int[] array) {
        // определяем длину массива, присваеваем её переменной size.
        int size = array.length;
        // проходим по каждому элементу массива. Важно, что цикл будет выполнятся на половину меньше, чем
        // длинна массива.
        for (int index = 0; index < size / 2; index++) {
            // создаем переменную temp, присваиваем ей значение, лежащее в ячейке массива.
            int temp = array[index];
            // меняем местами индексы в массиве array.
            array[index] = array[size - index - 1];
            // присваиваем ячейке значение переменной temp
            array[size - index - 1] = temp;
        }
        return array;
    }
}