package figures;

import java.text.*;
import java.util.*;

public abstract class Shape {

    public abstract double area();

    public void displayArea() {

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
