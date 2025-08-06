package sound;

public class CarHorn implements SoundEmitter {

    @Override
    public void makeSound() {
        System.out.println("Машина тихо бибикает");
    }
}
