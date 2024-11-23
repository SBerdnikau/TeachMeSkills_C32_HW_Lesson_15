package com.teachmeskills.lesson_15.task3.option;

import java.util.List;

public class Calculate {
    public static void showArithmeticMean(List<Integer> list){
        double arithmeticMean = 0;
        double sum = 0;
        for (int i : list){
            sum += i;
            arithmeticMean = sum / list.size();
        }

        System.out.printf("arithmeticMean = %.2f " , arithmeticMean);
    }
}
