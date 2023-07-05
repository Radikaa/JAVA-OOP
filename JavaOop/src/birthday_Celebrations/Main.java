package birthday_Celebrations;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Birthable> birthableList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] inputData = input.split(" ");
            String type = inputData[0];
            String name = inputData[1];
            if (type.equals("Citizen")) {
                int age = Integer.parseInt(inputData[2]);
                String id = inputData[3];
                String birthDayCitizen = inputData[4];
                Citizen citizen = new Citizen(name, age, id, birthDayCitizen);
                birthableList.add(citizen);
            } else if (type.equals("Pet")) {
                String birthDay = inputData[2];
                Pet pet = new Pet(name, birthDay);
                birthableList.add(pet);
            }
            input = scanner.nextLine();
        }

        boolean isTrue = false;
        String inputData = scanner.nextLine();
        for (Birthable birthable : birthableList) {
            if (birthable.getBirthDate().endsWith(inputData)) {
                System.out.println(birthable.getBirthDate());
                isTrue = true;
            }
        }
        if (isTrue == false) { //!isTrue
            System.out.println("<no output>");
        }
    }
}