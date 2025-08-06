package figures;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public abstract class Shape {

    public abstract double area();

    public void displayArea() {
        System.out.println("Данный метод вычисляет площадь фигуры");
    }

    public double formatNumberToDecimal(double number) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.##", symbols);
        String formattedString = df.format(number);
        double formatted = Double.parseDouble(formattedString);
        return formatted;
    }

}
