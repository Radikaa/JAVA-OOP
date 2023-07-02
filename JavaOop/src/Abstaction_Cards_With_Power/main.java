package Abstaction_Cards_With_Power;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardRank cardRank = CardRank.valueOf(scanner.nextLine());
        CardSuits cardSuit = CardSuits.valueOf(scanner.nextLine());
        Cards cards = new Cards(cardRank,cardSuit);
        System.out.printf("Card name: %s of %s; Card power: %d",cards.getCardRank(),cards.getCardSuits(),cards.getPower());
    }
}