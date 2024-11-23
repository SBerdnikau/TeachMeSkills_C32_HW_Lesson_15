package com.teachmeskills.lesson_15.task4;

import java.util.HashSet;
import java.util.Set;

/**
 * Создать коллекцию уникальных имен всех студентов нашей группы + преподаватель.
 * Вывести коллекцию на экран.
 */
public class Runner {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Andreich");
        names.add("Dmitriy");
        names.add("Ilya");
        names.add("Flame");
        names.add("Igor");
        names.add("Marina");
        names.add("Daniil");
        names.add("Sultan");
        names.add("Georgi");
        names.add("Kirill");
        names.add("Kate");
        names.add("Dmitry");
        names.add("Rita");
        names.add("Vlad");
        names.add("Sergio");
        names.add("Oleg");

        for (String name : names){
            System.out.print(name + ", ");
        }
    }
}
