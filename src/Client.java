public class Client {
    public static String makeManualCars() {
        Director director = new Director();

        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getProduct();


        return manual.toString();
    }

    public static String makeCars() {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSUV(builder);
        Car car = builder.getProduct();

        return car.toString();
    }
}
