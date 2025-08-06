package soundTest;

import org.junit.jupiter.api.*;
import sound.*;

import java.io.*;

public class SoundTest {

    @Test
    public void dogTest() {
        Dog dog = new Dog();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        dog.makeSound();
        Assertions.assertEquals("Собака говорит гав!", outContent.toString().trim());
    }

    @Test
    public void carHornTest() {
        CarHorn carHorn = new CarHorn();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        carHorn.makeSound();
        Assertions.assertEquals("Машина тихо бибикает", outContent.toString().trim());
    }

    @Test
    public void alarmClockTest() {
        AlarmClock alarmClock = new AlarmClock();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        alarmClock.makeSound();
        Assertions.assertEquals("Будильник бесяче звенит", outContent.toString().trim());
    }
}
