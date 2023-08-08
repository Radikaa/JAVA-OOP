package VehiclesOne;

public class Truck extends Vehicles {
    private final static double AC_INCREASED_CONSUMPION = 1.6;
    private final static double FUEL_AFTER_DRIVER_DEDUCTION = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + AC_INCREASED_CONSUMPION);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * FUEL_AFTER_DRIVER_DEDUCTION);
    }
}