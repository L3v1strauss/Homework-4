package com.homework.tasks;

/**
 * 2. Написать программу, вычисляющую и отображающую все числа
 * Фибоначчи меньше введённого пользователем целого числа.
 * Решить двумя способами: с помощью цикла и с помощью
 * рекурсии.
 */
public class HomeWorkTask4 {

    public static void main(String[] args) {
        fibonacci(100);
    }

    public static void fibonacci(int value) {
        int value1 = 0;
        System.out.println(value1);
        int value2 = 1;
        System.out.println(value2);
        for (int value3 = 1; value3 < value; value3 = value1 + value2) {
            value1 = value2;
            value2 = value3;
            System.out.println(value3);
        }
    }
}
