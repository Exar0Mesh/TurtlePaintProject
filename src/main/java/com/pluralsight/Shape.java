package com.pluralsight;

import java.awt.geom.Point2D;
import java.awt.Color;

public abstract class Shape {
    private Turtle turtle;
    private Point2D.Double location;
    private Color color;
    private double border;
    private double height;

    public Shape() {}

    public Shape(Turtle turtle, Point2D.Double location, Color color, double width) {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.border = width;
    }

    public abstract void paint();
}
