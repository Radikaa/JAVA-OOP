package Abstaction_cardRank;


import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        Arrays.stream(CardRank.values()).forEach(card ->
                System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card.name()));
    }
}
