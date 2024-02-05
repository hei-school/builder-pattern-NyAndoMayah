public class ManualBuilder implements Builder {
    private Manual manual;

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        manual.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean computer) {
        manual.setTripComputer(computer);
    }

    @Override
    public void setGPS(boolean GPS) {
        manual.setGPS(GPS);
    }

    public Manual getProduct() {
        Manual product = manual;
        reset();
        return product;
    }
}
