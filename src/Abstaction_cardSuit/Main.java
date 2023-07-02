package Abstaction_cardSuit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        Arrays.stream(CardsSuits.values()).forEach(cardsSuit ->
                System.out.printf("Ordinal value: %d; Name value: %s%n", cardsSuit.ordinal(), cardsSuit.name()));
    }
}