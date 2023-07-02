package Abstaction_Cards_With_Power;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int cardSuits;

    CardSuits(int cardSuits) {
        this.cardSuits = cardSuits;
    }

    public int getCardSuits() {
        return cardSuits;
    }
}