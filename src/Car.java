public class Car {
    private boolean GPS;
    private int seats;
    private boolean tripComputer;

    private String engine;

    public void setEngine(String engine) {
        this.engine = engine;
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

    @Override
    public String toString() {
        return "Car{" +
                "GPS=" + GPS +
                ", seats=" + seats +
                ", tripComputer=" + tripComputer +
                ", engine='" + engine + '\'' +
                '}';
    }
}
