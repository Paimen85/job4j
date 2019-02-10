package ru.job4j.array;

public class CheckDiagonal {
    public boolean diagonal(int[][] table) {
        boolean result = false;
        int sum = 0;
        int sum1 = 0;
        for (int i = 0, j = table.length - 1; i < table.length; i++, j--) {
            if (table[i][i] == 1 || table[i][j] == 1) {
                sum = sum + table[i][i];
                sum1 = sum1 + table[i][j];
                if (sum == table.length || sum1 == table.length) {
                    result = true;
                }
            }
        }
        return result;
    }
}