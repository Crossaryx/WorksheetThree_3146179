import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShapeTest {

    @Test
    public void testRightAngledTriangle() { // test case for the RightAngledTriangle class
        RightAngledTriangle rightAngledTriangle = new RightAngledTriangle("Right Angled Triangle", 8, 6);
        assertEquals("Right Angled Triangle", rightAngledTriangle.getName());
        assertEquals(8.0, rightAngledTriangle.getLeg1(), 0);
        assertEquals(6.0, rightAngledTriangle.getLeg2(), 0);
        assertEquals(24.0, rightAngledTriangle.perimeter(), 0);
        assertEquals(24.0, rightAngledTriangle.area(), 0);
        assertEquals("Shape: Right Angled Triangle\nArea: 24.0\nPerimeter: 24.0", rightAngledTriangle.toString());
    }

    @Test
    public void testRhombus() { // test case for the Rhombus class
        Rhombus rhombus = new Rhombus("Rhombus", 9, 8);
        assertEquals("Rhombus", rhombus.getName());
        assertEquals(9.0, rhombus.getSide(), 0);
        assertEquals(8.0, rhombus.getHeight(), 0);
        assertEquals(36.0, rhombus.perimeter(), 0);
        assertEquals(72.0, rhombus.area(), 0);
        assertEquals("Shape: Rhombus\nArea: 72.0\nPerimeter: 36.0", rhombus.toString());
    }

    @Test
    public void testCircle() { // test case for the Circle class
        Circle circle = new Circle("Circle", 10);
        assertEquals("Circle", circle.getName());
        assertEquals(10.0, circle.getRadius(), 0);
        assertEquals(62.83, circle.perimeter(), 0);
        assertEquals(314.16, circle.area(), 0);
        assertEquals("Shape: Circle\nArea: 314.16\nPerimeter: 62.83", circle.toString());
    }


    @Test
    public void testShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();

        // Add two instances of each subclass
        shapes.add(new Circle("Circle-1", 20));
        shapes.add(new Circle("Circle-2", 30));
        shapes.add(new RightAngledTriangle("Right Angled Triangle-1", 8, 6));
        shapes.add(new RightAngledTriangle("Right Angled Triangle-2", 3, 4));
        shapes.add(new Rhombus("Rhombus-1", 10.3, 12));
        shapes.add(new Rhombus("Rhombus-2", 5, 4));

        // a 2d array that holds the expected values for the area and perimeter of each shape
        double[][] expVal = {
                {1256.64, 125.66}, // Circle1
                {2827.43, 188.50}, // Circle2
                {24.0, 24.0},      // Right Angled Triangle1
                {6.0, 12.0},       // Right Angled Triangle2
                {123.6, 41.2},      // Rhombus1
                {20.0, 20.0}       // Rhombus2
        };

        // we loop through the shaped list, looking up the expected values and comparing them to the actual values
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            double area = shape.area();
            double perimeter = shape.perimeter();

            // Check if the area and perimeter match the expected values
            assertEquals("Area should match expected value", expVal[i][0], area, 0);
            assertEquals("Perimeter should match expected value", expVal[i][1], perimeter, 0);

            // Print the shape details
            System.out.println(shape.toString());
        }
    }
}
