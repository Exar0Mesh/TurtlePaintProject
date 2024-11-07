package com.pluralsight;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How big would you like your world to be?: ");
        System.out.println("Width: ");
        int width = scanner.nextInt();
        System.out.println("Height: ");
        int height = scanner.nextInt();

        //World world = new World(width, height);

        System.out.println("What would you like to do?: ");
        System.out.println("1) Add Shape \n2) Save Image \n0) Exit");
        System.out.println("input here: ");
        int answer = scanner.nextInt();

        switch(answer) {
            case 1:
                System.out.println("Which shape: ");
                System.out.println("1. square, 2. circle, 3. triangle");
                int shape = scanner.nextInt();
                if (shape == 1) {
                    //fill in the information with scanner options
                    getSquares();
                    break;
                }
                if (shape == 2) {
                    //fill in the information with scanner options
                    getCircles();
                    break;
                }
                if (shape == 3) {
                    getTriangles();
                    break;
                    //fill in the information with scanner options
                }
                break; //Add Shape
            case 2:
                //Will need an external method
                break; //Save Shape
            case 0:
                break; //System.exit
        }
    }
    public static void getSquares() {
        Square square = new Square();
        square.paint();
    }
    public static void getCircles() {
        Circle circle = new Circle();
        circle.paint();
    }
    public static void getTriangles() {
        Triangle triangle = new Triangle();
        triangle.paint();
    }
}