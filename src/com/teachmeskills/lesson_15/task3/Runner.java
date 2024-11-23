package com.teachmeskills.lesson_15.task3;

import com.teachmeskills.lesson_15.task3.exception.InvalidFormatException;
import com.teachmeskills.lesson_15.task3.exception.WrongNegativeNumberFormatException;
import com.teachmeskills.lesson_15.task3.option.Calculate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Создать коллекцию целых чисел.
 * Заполните коллекцию рандомными числами.
 * Пусть размер коллекции задается с консоли.
 * Предусмотреть проверку введенного размера коллекции на валидность.
 * Посчитайте и выведите на экран среднее арифметическое все элементов коллекции.
 */
public class Runner {
    public static void main(String[] args) {
        System.out.print("Enter capacity collection: ");
        try(Scanner scanner = new Scanner(System.in)) {
            String value = scanner.nextLine().trim();

            if (value.isEmpty()){
                throw new InvalidFormatException("Incorrect format", 100);
            }

            int capacity = Integer.parseInt(value);

            if (capacity <= 0){
                throw new WrongNegativeNumberFormatException("Negative number", 200);
            }

            List<Integer> listInt = new ArrayList<>(capacity);

            do {
                listInt.add((int) (Math.random() * 100));
            } while (listInt.size() != capacity);

            Calculate.showArithmeticMean(listInt);

        }catch (Exception e){
            System.out.println("General input exception: " + e.getMessage());
        }
    }
}