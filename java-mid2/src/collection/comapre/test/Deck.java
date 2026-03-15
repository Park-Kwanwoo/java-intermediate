package collection.comapre.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
        shuffle();
    }

    public Card draw() {
        return cards.removeFirst();
    }

    public void print() {
        System.out.println(cards);
    }

    private void initCard() {
        for (int i = 1; i <= 13; i++) {
            for (CardType value : CardType.values()) {
                cards.add(new Card(value, i));
            }
        }
    }

    protected  void shuffle() {
        Collections.shuffle(cards);
    }
}
