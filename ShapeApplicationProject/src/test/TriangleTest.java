package test;

import application.java.exception.InvalidTriangleException;
import application.java.model.ShapeType;
import application.java.model.triangle.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void invalidTriangle_shouldThrowException(){
        assertThrows(InvalidTriangleException.class, () -> new Triangle(1,2,3));
    }

    @Test
    void whenAllSidesEqual_shouldReturnEquilateral() {
        Triangle triangle = new Triangle(4,4,4);
        assertEquals(ShapeType.EQUILATERAL, triangle.getShapeType());
    }

    @Test
    void whenTwoSidesEqual_shouldReturnIsosceles() {
        Triangle triangle = new Triangle(4,4,6);
        assertEquals(ShapeType.ISOSCELES, triangle.getShapeType());
    }

    @Test
    void whenNoSidesEqual_shouldReturnScalene() {
        Triangle triangle = new Triangle(4,5,6);
        assertEquals(ShapeType.SCALENE, triangle.getShapeType());
    }

}