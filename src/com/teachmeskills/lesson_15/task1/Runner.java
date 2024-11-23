package com.teachmeskills.lesson_15.task1;

import com.teachmeskills.lesson_15.task1.exception.InvalidFormatException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Создать коллекцию целых чисел и заполнить ее значениями, введенными с консоли.
 * При заполнении коллекции числами с консоли следует делать приведения типа.
 * Код для привдения строки к числу можно использовать следующий:
 * 	int i = Integer.parseInt(str);
 * 	или
 * 	int val = Integer.valueOf(str);
 * Для окончания ввода введите слово "exit".
 * При приведении строки к числу, следует учитывать возможность исключений.
 * На экран вывести четные числа из коллекции.
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter numbers into the collection, to exit enter 'exit':");
        List<Integer> collectionInt = new ArrayList<>();

            try (Scanner scanner = new Scanner(System.in)) {
                while (true) {
                    String value = scanner.nextLine().trim();

                    if (value.equalsIgnoreCase("exit")) {
                        break;
                    }

                    try {
                        collectionInt.add(Integer.parseInt(value));
                    } catch (Exception e) {
                        throw new InvalidFormatException("Incorrect format.", 100);
                    }
                }

            }catch(Exception e){
                    System.out.println("General input error. " + e.getMessage());
            }


        for (int i : collectionInt){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }

    }
}
