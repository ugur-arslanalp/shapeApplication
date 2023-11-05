package application.java.model.triangle;

public class TriangleHelper implements ITriangleHelper {

    @Override
    public boolean isTriangleEquilateral(double side1, double side2, double side3) {
        return (side1 == side2 && side1 == side3);
    }

    @Override
    public boolean isTriangleIsosceles(double side1, double side2, double side3) {
        return (side1 == side2 || side2 == side3 || side1 == side3);
    }
}
