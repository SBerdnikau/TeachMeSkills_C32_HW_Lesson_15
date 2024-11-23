package com.teachmeskills.lesson_15.task2.figure.circle;

import com.teachmeskills.lesson_15.task2.figure.Figure;

public class Circle extends Figure {

    double radius;

    public Circle(double radius) {
        this.name = "Circle";
        this.radius = radius;
    }

    /**
     *
     * @return area of circle
     */
    @Override
    public double getAreaOfFigure() {
        return Math.PI * (radius * radius);
    }

    /**
     *
     * @return perimeter of circle
     */
    @Override
    public double getPerimeterOfFigure() {
        return 2 * Math.PI * radius;
    }
}
