package Lasagna;

public class Lasagna {
    public static int expectedMinutesInOven() {
        return 40;
    }
    public static int remainingMinutesInOven(int remaining) {
        return 40 - remaining;
    }
    public static int preparationTimeInMinutes(int layers) {
        return layers*2;
    }
    public static int totalTimeInMinutes(int layers, int remaining) {
        return (layers * 2) + remaining;
    }

}