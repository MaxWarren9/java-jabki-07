package figures;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            System.out.println("Для введенного числа нельзя рассчитать площадь");
        } else {
            this.width = width;
            this.height = height;
        }
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void displayArea() {
        double areaFormatted = formatNumberToDecimal(area());
        System.out.println("Площадь прямоугольника: " + areaFormatted);
    }
}
