import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        float num1 = 2.15f;
        float num2 = 1.10f;
        System.out.println(num1 - num2);


        // use a string for big decimal ( ALWAYS USE FOR MONEY)
        BigDecimal num3 = new BigDecimal("2.15");
        BigDecimal num4 = new BigDecimal("1.10");
        System.out.println(num3.subtract(num4));


        // Key Methods of Big Decimal
        System.out.println(new BigDecimal(".311251").add(new BigDecimal("5.3124")));
        System.out.println(new BigDecimal(".311251").subtract(new BigDecimal("5.3124")));
        System.out.println(new BigDecimal(".3421351").multiply(new BigDecimal("5.3124")));

        //////////
        MathContext mathContext = new MathContext(5, RoundingMode.HALF_UP);
        System.out.println(new BigDecimal(".311251").divide(new BigDecimal("5.3124"),mathContext));
        System.out.println(new BigDecimal("49").sqrt(mathContext));

        ////////
        System.out.println(new BigDecimal("49").max(new BigDecimal("13")));
        System.out.println(new BigDecimal("49").min(new BigDecimal("13")));
        System.out.println(new BigDecimal("13").remainder(new BigDecimal("8")));

        //// More on Big Decimal

        BigDecimal num5 = new BigDecimal("3.141592"); // dont do this , its coming from a  primitive or floating point number
        System.out.println(num5);


    }
}
