package ru.job4j.puzzle;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Test.
 * @author Evgeny Baranov (evgeni.baranov@gmail.com)
 * @version 1.0
 * @since 0.1
 */
public class LogicTest {
    @Test
    public void whenVerticalWin() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][] {
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                };
            }
        };
        assertThat(logic.isWin(), is(true));
    }

    @Test
    public void whenHorizontalWin() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][] {
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
            }
        };
        assertThat(logic.isWin(), is(true));
    }

    @Test
    public void whenNotWin() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][] {
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {1, 1, 0, 1, 1},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                };
            }
        };
        assertThat(logic.isWin(), is(false));
    }
    @Test
    public void whenOnly3InVerticalNotWin() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][] {
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 0, 1, 0},
                        {0, 0, 0, 1, 0},
                };
            }
        };
        assertThat(logic.isWin(), is(false));
    }
    @Test
    public void whenOnly3InHorizontalNotWin() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][] {
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0},
                        {0, 0, 0, 1, 1},
                        {0, 0, 0, 0, 0},
                };
            }
        };
        assertThat(logic.isWin(), is(false));
    }

}