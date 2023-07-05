package foodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfPeople = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> map = new HashMap<>();
        for (int i = 1; i <= countOfPeople; i++) {
            String[] inputData = scanner.nextLine().split(" ");
            String name = inputData[0];
            int age = Integer.parseInt(inputData[1]);
            if (inputData.length == 4) {
                String id = inputData[2];
                String birthDay = inputData[3];
                Citizen citizen = new Citizen(name, age, id, birthDay);
                map.put(name, citizen);
            } else {
                String group = inputData[2];
                Rebel rebel = new Rebel(name, age, group);
                map.put(name, rebel);
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            if (map.get(command) != null) {
                map.get(command).buyFood();
            }
            command = scanner.nextLine();
        }
        int sumFood = map.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(sumFood);
    }
}