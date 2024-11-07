package com.pluralsight;

import java.awt.*;
import java.awt.geom.Point2D;

public class Circle extends Shape{
    public Circle() {
    }

    public Circle(Turtle turtle, Point2D.Double location, Color color, double width) {
        super(turtle, location, color, width);
    }

    @Override
    public void paint() {
        World world = new World(200, 200);
        Turtle turtle = new Turtle(world,-100, -100);

        int radius = 100;
        double hypotenuse = (2 * Math.PI * radius);

        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);
while (true) {
    turtle.forward(hypotenuse);
    break;
}
    }
}
