package sound;

public class AlarmClock implements SoundEmitter {
    @Override
    public void makeSound() {
        System.out.println("Будильник бесяче звенит");
    }
}
