package figures;

public class Circle extends Shape{

    double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            System.out.println("Для введенного числа нельзя рассчитать площадь");
        } else {
            this.radius = radius;
        }
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void displayArea() {
        double areaFormatted = formatNumberToDecimal(area());
        System.out.println("Площадь круга: " + areaFormatted);
    }
}
