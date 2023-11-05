package application;

import application.java.exception.InvalidTriangleException;
import application.java.model.triangle.Triangle;
import java.util.Scanner;

public class ShapeApplicationMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please Enter the Lengths of Triangle Sides: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) break;

            String[] sidesString = input.split(",");

            if (sidesString.length != 3) {
                System.out.println("Number of inputs must be exactly 3");
                continue;
            }
            try {
                double side1 = Double.parseDouble(sidesString[0]);
                double side2 = Double.parseDouble(sidesString[1]);
                double side3 = Double.parseDouble(sidesString[2]);

                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println("The triangle is " + triangle.getShapeType().toString());

            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("An invalid input entered " + illegalArgumentException.getMessage());
            } catch (InvalidTriangleException invalidTriangleException) {
                System.out.println(invalidTriangleException.getMessage());
            }
        } while (true);
    }
}