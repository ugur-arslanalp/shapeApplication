package application.java.model.triangle;

import application.java.exception.InvalidTriangleException;
import application.java.model.Shape;
import application.java.model.ShapeType;

public class Triangle implements Shape {

    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3) {

        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new InvalidTriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public ShapeType getShapeType() {
        TriangleHelper helper = new TriangleHelper();
        if (helper.isTriangleEquilateral(side1, side2, side3)) {
            return ShapeType.EQUILATERAL;
        } else if (helper.isTriangleIsosceles(side1, side2, side3)) {
            return ShapeType.ISOSCELES;
        }
        return ShapeType.SCALENE;
    }
}
