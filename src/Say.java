class Say {
    static String[] under_twenty = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen"};
    static String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    String say(long number)  {
        if (number < 0) {
            throw new IllegalArgumentException("must be positive number");
        }
        if (number < 20) {
            return under_twenty[(int)number];
        }
        if (number % 10 == 0 && number < 100)  {
            int n = ((int)number - 20) / 10;
            return tens[n];
        }
        if (number >= 21 && number < 100) {
            return say(number/10 * 10) + "-" + say(number % 10);
        }
        if (number < 1_000) {
            return sufix(number, 100, "hundred");
        }
        if (number < 1_000_000) {
            return sufix(number, 1_000, "thousand");
        }
        if (number < 1_000_000_000) {
            return sufix(number, 1_000_000, "million");
        }
        if (number < 1_000_000_000_000L) {
            return sufix(number, 1_000_000_000, "billion");
        }
        throw new IllegalArgumentException("not supported");
    }
    private String sufix(long number, long modulo, String suffix) {
        var a = number / modulo;
        var b = number % modulo;
        if (b == 0) {
            return say(a) + " " + suffix;
        } else {
            return say(a) + " " + suffix + " " + say(b);
        }
    }
}
