public class Manual {
    private boolean GPS;
    private int seats;
    private boolean tripComputer;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    private String engine;

    @Override
    public String toString() {
        return "Manual{" + "GPS=" + GPS + ", seats=" + seats + ", tripComputer=" + tripComputer + ", engine='" + engine + '\'' + '}';
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public boolean getGPS() {
        return GPS;
    }

    public int getSeats() {
        return seats;
    }

    public boolean getTripComputer() {
        return tripComputer;
    }
}
