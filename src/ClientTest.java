import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTest {

    @Test
    public void make_cars_ok() {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSUV(carBuilder);
        Car car = carBuilder.getProduct();

        String expectedCar = car.toString();

        String actualCar = Client.makeCars();

        assertEquals("Expected car details", expectedCar, actualCar);
    }

    @Test
    public void make_manual_ok() {
        Director director = new Director();

        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getProduct();

        String expectedManual = manual.toString();

        String actualManual = Client.makeManualCars();

        assertEquals("Expected manual details", expectedManual, actualManual);
    }
}
