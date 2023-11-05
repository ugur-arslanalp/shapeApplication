package test;

import application.java.model.triangle.TriangleHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleHelperTest {

    @Test
    void whenTriangleEquilateral_shouldReturnTrue() {
        TriangleHelper helper = new TriangleHelper();
        assertEquals(true, helper.isTriangleEquilateral(2,2,2));
    }

    @Test
    void whenTriangleIsosceles_shouldReturnTrue() {
        TriangleHelper helper = new TriangleHelper();
        assertEquals(true, helper.isTriangleIsosceles(3,3,4));
    }
}