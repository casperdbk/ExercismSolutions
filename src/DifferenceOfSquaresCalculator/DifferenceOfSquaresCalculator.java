package DifferenceOfSquaresCalculator;

class DifferenceOfSquaresCalculator {

    static int computeSquareOfSumTo(int input) {
        int number = 0;
        for (int i = 1; i <= input; i++) {
            number += i;
        }
        return (int) Math.pow(number, 2);
    }

    static int computeSumOfSquaresTo(int input) {
        int number = 0;
        for (int i = 1; i <= input; i++) {
            number += Math.pow(i,2);
        }
        return number;
    }

    static int computeDifferenceOfSquares(int input) {
        int sum = computeSquareOfSumTo(input);
        int squares = computeSumOfSquaresTo(input);
        return sum - squares;
    }



}
