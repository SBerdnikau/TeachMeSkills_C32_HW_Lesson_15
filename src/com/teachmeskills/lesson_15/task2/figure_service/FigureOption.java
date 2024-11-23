package com.teachmeskills.lesson_15.task2.figure_service;

import com.teachmeskills.lesson_15.task2.figure.Figure;

import java.util.List;

public class FigureOption {

    public static void showPerimeter(List<Figure> figures) {
        for (Figure figure : figures) {
            System.out.printf("Name Figure: %s, Perimeter: %.2f\n", figure.name, figure.getPerimeterOfFigure());
        }
    }

}
