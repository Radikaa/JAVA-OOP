package VehiclesOne;

public class Car extends Vehicles {
    private final static double AC_INCREASED_CONSUMPION = 0.9;


    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + AC_INCREASED_CONSUMPION);
    }


}