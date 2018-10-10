import itcollege.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // printNumbers(PrimeNumberCalculator.calcTo(100));
        PrimeNumberCalculator.calcTo(100);
    }
        private static void printNumbers(List<Integer> numbers) {
            for (int number: numbers) {
                System.out.println(number);
            }
        }
}
