package ru.job4j.converter;

/**
 * Конвертор валюты.
 */
public class Converter {
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return dollar Доллары.
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }
    /**
     * Конвертируем евро в рубли.
     * @param euro Евро.
     * @return рубли.
     */
    public int euroToRubles(int euro) {
        return euro * 70;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param dollar Евро.
     * @return рубли.
     */
    public int dollarToRubles(int dollar) {
        return dollar * 60;
    }
}