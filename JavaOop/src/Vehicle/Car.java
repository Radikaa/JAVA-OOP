package Vehicle;

public class Car extends Vehicle {
    private final static double AC_INCREASED_CONSUMPION = 0.9;


    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity, AC_INCREASED_CONSUMPION);
    }
}