package ElonsToyCar;

public class ElonsToyCar {
    private int distance;
    private int battery = 100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %s meters", this.distance);
    }

    public String batteryDisplay() {
        if (this.battery == 0) {
            return "Battery empty";
        }
        return String.format("Battery at %s%%", this.battery);
    }

    public void drive() {
        if (this.battery > 0) {
            this.distance += 20;
            this.battery -= 1;
        }
    }
}