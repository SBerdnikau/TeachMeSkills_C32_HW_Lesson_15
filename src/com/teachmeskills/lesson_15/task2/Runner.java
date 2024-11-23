package com.teachmeskills.lesson_15.task2;

import com.teachmeskills.lesson_15.task2.figure.Figure;
import com.teachmeskills.lesson_15.task2.figure.circle.Circle;
import com.teachmeskills.lesson_15.task2.figure.rectangle.Rectangle;
import com.teachmeskills.lesson_15.task2.figure.triangle.Triangle;
import com.teachmeskills.lesson_15.task2.figure_service.FigureOption;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать коллекцию фигур.
 * (взять классы для фигур из предыдущих домашних заданий)
 * Заполнить коллекцию различными фигурами.
 * Пройти циклом по коллекции и вызвать метод для подсчета и вывода на экран периметра каждой фигуры.
 */
public class Runner {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();

        figures.add( new Circle(5));
        figures.add( new Rectangle(4,2));
        figures.add( new Triangle(6,5,2.2));
        figures.add( new Circle(7.8));
        figures.add( new Triangle(18,15, 8));

        FigureOption.showPerimeter(figures);

    }
}
