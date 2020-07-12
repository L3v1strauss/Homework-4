package com.homework.tasks;

/**
 * Написать программу, вычисляющую сумму цифр введённого
 * пользователем целого числа.
 */
public class HomeWorkTask3 {

    public static void main(String[] args) {
        System.out.println(sumNumbers(123456789));
        System.out.println(sumNumbersFor(123456789));
    }

    public static int sumNumbers(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }

        return result;
    }

    public static int sumNumbersFor(int value) {
        int result = 0;
        for (int currentValue = value; currentValue != 0; currentValue /= 10) {
            result += currentValue % 10;
        }

        return result;
    }
}
