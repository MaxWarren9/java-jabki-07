package figuresTest;

import figures.*;
import org.junit.jupiter.api.*;

import java.io.*;

public class FiguresTest {

    @Test
    public void circlesTest() {
        Circle circle = new Circle(1);
        Assertions.assertEquals(3.14, circle.formatNumberToDecimal(circle.area()));
        Assertions.assertNotEquals(3.1415, circle.formatNumberToDecimal(circle.area()));
        Assertions.assertNotEquals(2, circle.formatNumberToDecimal(circle.area()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Circle circle1 = new Circle(-1);
        Assertions.assertEquals("Для введенного числа нельзя рассчитать площадь", outContent.toString().trim());
    }

    @Test
    public void rectanglesTest() {
        Rectangle rectangle = new Rectangle(2, 4);
        Assertions.assertEquals(8, rectangle.formatNumberToDecimal(rectangle.area()));
        Assertions.assertNotEquals(7, rectangle.formatNumberToDecimal(rectangle.area()));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Rectangle rectangle1 = new Rectangle(-1, 5);
        Assertions.assertEquals("Для введенного числа нельзя рассчитать площадь", outContent.toString().trim());
    }
}
