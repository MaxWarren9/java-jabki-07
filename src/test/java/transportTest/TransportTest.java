package transportTest;

import main.*;
import org.junit.jupiter.api.*;
import transport.*;

import java.io.*;

public class TransportTest {

    @Test
    public void vehicleTest() {
        Airplane airplane = new Airplane(500);
        Bicycle bicycle = new Bicycle(10);
        Assertions.assertEquals(500, airplane.speed);
        Assertions.assertEquals(10, bicycle.speed);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        airplane.move();
        Assertions.assertEquals("Самолет летит со скоростью 500 километров в час", outContent.toString().trim());
        ByteArrayOutputStream outContent2 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent2));
        bicycle.move();
        Assertions.assertEquals("Велосипед едет со скоростью 10 километров в час", outContent2.toString().trim());
        ByteArrayOutputStream outContent3 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent3));
        Transport[] vehicles = {airplane, bicycle};
        Main.startRace(vehicles);
        Assertions.assertEquals("Самолет летит со скоростью 500 километров в час \nВелосипед едет со скоростью 10 километров в час", outContent3.toString().trim());

    }
}
