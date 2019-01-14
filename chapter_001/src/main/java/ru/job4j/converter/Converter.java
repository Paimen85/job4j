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
        int euro = value / 70;
        return euro;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return dollar Доллары.
     */
    public int rubleToDollar(int value) {
        int dollar = value / 60;
        return dollar;
    }
    /**
     * Конвертируем евро в рубли.
     * @param euro Евро.
     * @return value рубли.
     */
    public int euroToRubles(int euro) {
        int value = euro * 70;
        return value;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param dollar Евро.
     * @return value рубли.
     */
    public int dollarToRubles(int dollar) {
        int value = dollar * 60;
        return value;
    }
}