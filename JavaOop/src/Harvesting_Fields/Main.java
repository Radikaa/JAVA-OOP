package Harvesting_Fields;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);
        Class<harvestingFields.RichSoilLand> clazz = harvestingFields.RichSoilLand.class;
        Field[] fields = clazz.getDeclaredFields();
        String input = scanner.nextLine();

        while (!input.equals("HARVEST")) {
            for (Field field : fields) {
                if (field.equals(input)) {
                    System.out.printf("%s %s %s", field.getName(), field.getType(), field.getName());
                }
            }
            input = scanner.nextLine();
        }
    }
}