package PerfectNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NaturalNumber {
    int number;

    public NaturalNumber(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    public Classification getClassification() {
        Classification classification = null;
        List<Integer> divisors = new ArrayList<>();
        int loop = 1;
        while (loop < number) {
            if (number % loop == 0) {
                divisors.add(loop);
            }
            loop += 1;
        }
        Integer sum = divisors.stream().mapToInt(Integer::intValue).sum();
        if (sum == number) {
            classification = Classification.PERFECT;
        } else if (sum > number) {
            classification = Classification.ABUNDANT;
        }
        else {
            classification = Classification.DEFICIENT;
        }
        return classification;
    }
}