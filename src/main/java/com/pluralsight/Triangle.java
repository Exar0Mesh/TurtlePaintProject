package com.pluralsight;

import java.awt.geom.Point2D;
import java.awt.Color;

public class Triangle extends Shape{
    public Triangle() {
    }

    public Triangle(Turtle turtle, Point2D.Double location, Color color, double width) {
        super(turtle, location, color, width);
    }

    @Override
    public void paint() {
        World world = new World(300, 300);
        Turtle turtle = new Turtle(world,-100, -100);

        int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);

        turtle.turnRight(45);
        turtle.forward(hypotenuse);

        turtle.penUp();
        turtle.goTo(100, 100);
        turtle.turnRight(45);

        turtle.penDown();
        turtle.forward(hypotenuse);

        turtle.penUp();
        turtle.goTo(100, 100);
        turtle.turnRight(90);

        turtle.penDown();
        turtle.forward(hypotenuse);
    }

}
