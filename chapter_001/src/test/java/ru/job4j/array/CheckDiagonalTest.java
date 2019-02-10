package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckDiagonalTest {
    @Test
    public void tableDiagonalFullOneThenTrue() {
        CheckDiagonal diagonal1 = new CheckDiagonal();
        int[][] input = new int[][] {
                {1, 0 ,0 ,0 , 0},
                {0, 1 ,0 ,0 , 0},
                {0, 0 ,1 ,0 , 0},
                {0, 0 ,0 ,1 , 0},
                {0, 0 ,0 ,0 , 1}
        };
        boolean result = diagonal1.diagonal(input);
        assertThat(result,is(true));
    }
    @Test
    public void tableDiagonalNotFullOneThenTrue() {
        CheckDiagonal diagonal1 = new CheckDiagonal();
        int[][] input = new int[][] {
                {1, 0 ,0 ,0 , 0},
                {0, 1 ,0 ,0 , 0},
                {0, 0 ,0 ,0 , 0},
                {0, 0 ,0 ,1 , 0},
                {0, 0 ,0 ,0 , 1}
        };
        boolean result = diagonal1.diagonal(input);
        assertThat(result,is(false));
    }
    @Test
    public void tableDiagonal2NotFullOneThenTrue() {
        CheckDiagonal diagonal1 = new CheckDiagonal();
        int[][] input = new int[][] {
                {0, 0 ,0 ,0 , 1},
                {0, 0 ,0 ,1 , 0},
                {0, 0 ,0 ,0 , 0},
                {0, 1 ,0 ,0 , 0},
                {1, 0 ,0 ,0 , 0}
        };
        boolean result = diagonal1.diagonal(input);
        assertThat(result,is(false));
    }
    @Test
    public void tableDiagonal2FullOneThenTrue() {
        CheckDiagonal diagonal1 = new CheckDiagonal();
        int[][] input = new int[][] {
                {0, 0 ,0 ,0 , 1},
                {0, 0 ,0 ,1 , 0},
                {0, 0 ,1 ,0 , 0},
                {0, 1 ,0 ,0 , 0},
                {1, 0 ,0 ,0 , 0}
        };
        boolean result = diagonal1.diagonal(input);
        assertThat(result,is(true));
    }
}