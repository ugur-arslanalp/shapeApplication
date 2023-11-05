# Triangle Project

The Triangle Project is a Java application that determines the type of a triangle (EQUILATERAL, ISOSCELES, or SCALENE) based on the input of its three sides provided by the user.
## Prerequisites

- The project is built on Java 11.
- JUnit5 is used for unit testing.

## Usage

To use the Triangle Project, follow these instructions:

1. Execute the program either from your preferred IDE's console or by creating a .jar file and running that .jar file through your operating system's terminal.
````shell
java -jar C:\JAR_PATH\ShapeApplicationProject.jar
````
2. Provide the sides of the triangle as input in the format "side1, side2, side3". Double values must be separated by dots. Example input:
    - Equilateral -> 4,4,4
    - Isosceles -> 4.5,4.5,5
    - Scalene -> 4,5,6
3. The application will calculate and display the type of triangle based on the input.
4. To stop the program, type exit.

## Features

- Determines the type of triangle (EQUILATERAL, ISOSCELES, or SCALENE).
- Utilizes Java interfaces for improved code structure.
- Includes a set of unit tests for accurate functionality verification.
- Implements custom exception handling for better error reporting.

## To add new features
- To add a new feature for all the shapes
````java
public interface Shape {
    ShapeTypeEnum getShapeType();
    double getPerimeter();
    // Add new methods here such as `double getPerimeter();`
}
````
````java
@Override
public double getPerimeter() {
        return this.side1+this.side2+this.side3;
    
    // Override the method in the Triangle class;`
}
````
- To add a new feature for Triangle shape
````java
public interface ITriangleHelper {
    boolean isTriangleEquilateral(double side1, double side2, double side3);
    boolean isTriangleIsosceles(double side1, double side2, double side3);
    boolean isTriangleRightAngled(double side1, double side2, double side3);
    
    //Add new methods here such as `isTriangleRightAngled()`
}
````
````java
@Override
public boolean isTriangleRightAngled(double side1, double side2, double side3) {
        return side1 * side1 + side2 * side2 == side3 * side3 ||
        side1 * side1 + side3 * side3 == side2 * side2 ||
        side2 * side2 + side3 * side3 == side1;
        }
        // Override the method in TriangleHelper class
}
````
