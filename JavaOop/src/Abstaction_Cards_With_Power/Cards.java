package Abstaction_Cards_With_Power;

public class Cards {
    private CardRank cardRank;
    private CardSuits cardSuits;

    public CardRank getCardRank() {
        return cardRank;
    }

    public Cards(CardRank cardRank, CardSuits cardSuits) {
        this.cardRank = cardRank;
        this.cardSuits = cardSuits;
    }

    public void setCardRank(CardRank cardRank) {
        this.cardRank = cardRank;
    }

    public CardSuits getCardSuits() {
        return cardSuits;
    }

    public void setCardSuits(CardSuits cardSuits) {
        this.cardSuits = cardSuits;
    }

    public int getPower() {
        return cardRank.getCardRank() + cardSuits.getCardSuits();
    }
}