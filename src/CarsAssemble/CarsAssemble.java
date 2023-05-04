package CarsAssemble;

import java.util.Map;

public class CarsAssemble {
    private int carsPerHour = 221;
    private Map<Integer, Double> map = Map.ofEntries(
            Map.entry(1, 1.0),
            Map.entry(2, 1.0),
            Map.entry(3, 1.0),
            Map.entry(4,1.0),
            Map.entry(5,.9),
            Map.entry(6, .9),
            Map.entry(7, .9),
            Map.entry(8,.9),
            Map.entry(9, .8),
            Map.entry(10, .77)
    );
    public double productionRatePerHour(int speed) {
        if (speed == 0) {
            return 0.0;
        }
        return carsPerHour * speed * map.get(speed);
    }

    public int workingItemsPerMinute(int speed) {
        if (speed == 0) {
            return 0;
        }
        double result = (double) (carsPerHour * speed) /60 * map.get(speed);
        return (int) Math.round(result);
    }
}

