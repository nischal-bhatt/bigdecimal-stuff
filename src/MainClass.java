import java.math.BigDecimal;

public class MainClass {
    public static void main(String[] args) {
        double a = 2.3;
        double b = 2.2;
        double c = a-b;

        System.out.println(c);

        BigDecimal a1 = new BigDecimal(String.valueOf(a));
        BigDecimal b1 = new BigDecimal(String.valueOf(b));
        BigDecimal c1 = a1.subtract(b1);

        System.out.println(c1.doubleValue());
    }
}
