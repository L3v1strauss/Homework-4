package com.homework.tasks;

import java.util.Random;

public class HomeWorkTask5 {

    public static void main(String[] args) {
        int pre1 = 899;
        int pre2 = 350;
        int pre3 = 440;
        int pre4 = 670;
        int days = 4;
        System.out.println("Количество дней:" + " " + days);
        System.out.println("Максимальное количество дневных осадков" + " " + maxPrecipitation(days, pre1, pre2, pre3, pre4));
        System.out.println("Сумма осадков за период:" + " " + sumPrecipitation(days, pre1, pre2, pre3, pre4));
        System.out.println("Среднее количество осадков:" + " " + averagePrecipitation(days, pre1, pre2, pre3, pre4));
    }

    public static double averagePrecipitation(int days, int pre1, int pre2, int pre3, int pre4) {
        double result = (pre1 + pre2 + pre3 + pre4) / days;
        return result;
    }

    public static int sumPrecipitation(int days, int pre1, int pre2, int pre3, int pre4) {
        int result = pre1 + pre2 + pre3 + pre4;
        return result;
    }

    public static int maxPrecipitation(int days, int pre1, int pre2, int pre3, int pre4) {
        int maxPre = Integer.MIN_VALUE;
        for (int i = 1; i < days; i++) {
            if (maxPre < pre1) {
                maxPre = pre1;
            } else if (maxPre < pre2) {
                maxPre = pre2;
            } else if (maxPre < pre3) {
                maxPre = pre3;
            } else if (maxPre < pre4) {
                maxPre = pre4;
            }
        }

        return maxPre;
    }

}

