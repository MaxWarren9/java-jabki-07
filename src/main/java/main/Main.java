package main;

import figures.Circle;
import figures.Rectangle;
import figures.Shape;
import files.File;
import files.ImageFile;
import files.TextFile;
import payment.CreditCardPayment;
import playable.Playable;
import playable.Song;
import sound.AlarmClock;
import sound.CarHorn;
import sound.Dog;
import sound.SoundEmitter;
import transport.Airplane;
import transport.Bicycle;
import transport.Transport;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        CreditCardPayment payment = new CreditCardPayment(BigDecimal.TEN);
        payment.validate();
        payment.process();
        payment.complete();

        Song song = new Song("Песня про лето");
        song.play();

        Playable playable = new Song("Песня про весну!");
        playable.play();

        Shape[] shapes = new Shape[]{new Circle(5), new Rectangle(5, 4), new Circle(3), new Rectangle(2,3)};

        for (Shape shape: shapes) {
            shape.displayArea();
        }

        SoundEmitter[] devices = {new Dog(), new AlarmClock(), new CarHorn()};
        playAllSounds(devices);

        File[] files = {new TextFile("Текстовый файл", "Привет! Я учу Java =)"), new ImageFile("Картинка", 10, 10, 10)};
        System.out.println(calculateTotalSize(files));

        Transport[] vehicles = {new Bicycle(25), new Airplane(800)};
        startRace(vehicles);
    }

    public static void playAllSounds(SoundEmitter[] devices) {
        for (SoundEmitter device: devices) {
            device.makeSound();
        }
    }

    public static long calculateTotalSize(File[] files) {
        long totalSize = 0;
        for (File file: files) {
            totalSize += file.getSize();
        }
        return totalSize;
    }

    public static void startRace(Transport[] vehicles) {
        for (Transport vehicle: vehicles) {
            vehicle.move();
        }
    }
}