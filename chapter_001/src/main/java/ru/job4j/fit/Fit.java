package ru.job4j.fit;

/**
 * Программа расчёта идеального веса.
 */
public class Fit {
    /**
     * Идеаальный вес для мужчин.
     * @param height Рост.
     * @return Идеальный вес.
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }
    /**
     * Идеаальный вес для женщин.
     * @param height Рост.
     * @return Идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

}