package transport;

public abstract class Transport {
    public int speed;

    public Transport(int speed) {
        if (speed < 0) {
            System.out.println("Отрицательная скорость невозможна");
        } else {
            this.speed = speed;
        }
    }

    public abstract void move();
}
