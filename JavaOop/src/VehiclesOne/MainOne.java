package VehiclesOne;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carData = scanner.nextLine().split(" ");
        double carFuelQuantity = Double.parseDouble(carData[1]);
        double carLierPerKM = Double.parseDouble(carData[2]);
        Vehicles car = new Car(carFuelQuantity, carLierPerKM);

        String[] truckData = scanner.nextLine().split(" ");
        double truckFuelQuantity = Double.parseDouble(truckData[1]);
        double truckLierPerKM = Double.parseDouble(truckData[2]);
        Vehicles truck = new Truck(truckFuelQuantity, truckLierPerKM);

        Map<String, Vehicles> map = new LinkedHashMap<>();
        map.put("Car", car);
        map.put("Truck", truck);

        int countOfCommand = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= countOfCommand; i++) {
            String[] command = scanner.nextLine().split(" ");
            String commandType = command[0];
            String vechicleType = command[1];
            double argument = Double.parseDouble(command[2]);

            switch (commandType) {
                case "Drive":
                    System.out.println(map.get(vechicleType).drive(argument));
                    break;
                case "Refuel":
                    map.get(vechicleType).refuel(argument);
                    break;
            }
        }
        map.values().forEach(System.out::println);
    }
}
