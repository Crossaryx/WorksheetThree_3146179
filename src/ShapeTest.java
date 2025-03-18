import org.junit.Test;
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
}
