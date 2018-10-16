import java.math.BigDecimal;
import java.math.RoundingMode;

public class En5_4 {
    public static void main(String[] args) {
        BigDecimal val1 = new BigDecimal(1).setScale(4);
        BigDecimal val2 = new BigDecimal(9).setScale(4);

        BigDecimal val3 = val1.divide(val2, RoundingMode.HALF_UP);
        BigDecimal result = val3.multiply(val2);
        System.out.println(String.format("%.4f", result));
    }
}
