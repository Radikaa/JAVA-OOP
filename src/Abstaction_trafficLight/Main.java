package Abstaction_trafficLight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputLight = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int count = Integer.parseInt(scanner.nextLine());
        List<TrafficLight> trafficLightArrayList = new ArrayList<>();

        for (String light : inputLight) {
            Color currentColor = Color.valueOf(light);
            TrafficLight currentTrafficLight = new TrafficLight(currentColor);
            trafficLightArrayList.add(currentTrafficLight);
        }
        for (int i = 1; i <= count; i++) {
            for (TrafficLight trafficLight : trafficLightArrayList) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getCurrentColor() + " ");
            }
            System.out.println();
        }
    }
}