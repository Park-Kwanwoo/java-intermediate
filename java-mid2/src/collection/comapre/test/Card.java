package collection.comapre.test;

public class Card implements Comparable<Card> {

    private final CardType cardType;
    private final int rank;

    public Card(CardType cardType, int rank) {
        this.cardType = cardType;
        this.rank = rank;
    }

    public CardType emblem() {
        return cardType;
    }

    public int number() {
        return rank;
    }

    @Override
    public int compareTo(Card o) {
        if (rank != o.rank) {
            return Integer.compare(rank, o.rank);
        } else {
            return cardType.comparePriority(o.cardType);
        }
    }

    @Override
    public String toString() {
        return rank + "(" + cardType.emblem() + ")";
    }
}
