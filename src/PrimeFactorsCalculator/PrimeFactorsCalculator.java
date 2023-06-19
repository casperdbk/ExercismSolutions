package PrimeFactorsCalculator;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsCalculator {
    public static List<Long> calculatePrimeFactorsOf(long number) {
        List<Long> primes = new ArrayList<>();
        long divider = 2;
        while (number > 1) {
            if (number % divider == 0) {
                number /= divider;
                primes.add(divider);
            } else {
                divider += 1;
            }

        }
        return primes;
    }
}