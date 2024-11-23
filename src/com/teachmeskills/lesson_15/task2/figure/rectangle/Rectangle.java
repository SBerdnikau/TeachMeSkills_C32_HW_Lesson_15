package com.teachmeskills.lesson_15.task2.figure.rectangle;

import com.teachmeskills.lesson_15.task2.figure.Figure;

public class Rectangle extends Figure {

    double a;
    double b;

    public Rectangle(double a, double b) {
        this.name = "Rectangle";
        this.a = a;
        this.b = b;
    }

    /**
     *
     * @return area of rectangle, a,b - sides of a rectangle
     */
    @Override
    public double getAreaOfFigure() {
        return a * b;
    }

    /**
     *
     * @return perimeter of rectangle, a,b - sides of a rectangle
     */
    @Override
    public double getPerimeterOfFigure() {
        return  2 * (a + b);
    }
}
