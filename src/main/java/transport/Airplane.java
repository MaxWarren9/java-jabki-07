package transport;

public class Airplane extends Transport {

    public Airplane(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.printf("Самолет летит со скоростью %d километров в час \n", speed);
    }
}
