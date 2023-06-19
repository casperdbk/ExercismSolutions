package SpaceAge;

class SpaceAge {

    private double seconds;
    private final long earthTime = 31557600;
    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return this.getSeconds()/earthTime;
    }

    double onMercury() {
        return this.getSeconds()/(earthTime*0.2408467);
    }

    double onVenus() {
        return this.getSeconds()/(earthTime*0.61519726);
    }

    double onMars() {
        return this.getSeconds()/(earthTime*1.8808158);
    }

    double onJupiter() {
        return this.getSeconds()/(earthTime*11.862615);
    }

    double onSaturn() {
        return this.getSeconds()/(earthTime*29.447498);
    }

    double onUranus() {
        return this.getSeconds()/(earthTime*84.016846);
    }

    double onNeptune() {
        return this.getSeconds()/(earthTime*164.79132);
    }

}
