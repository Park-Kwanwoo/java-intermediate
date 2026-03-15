package collection.comapre.test;

import java.util.*;

public class Deck {

    private Deque<Card> cards = new ArrayDeque<>();

    public Deck() {
        initCard();
    }

    public List<Card> draw() {
        List<Card> draws = new ArrayList<>();
        for(int index = 0; index < 5; index++) {
            draws.add(cards.poll());
        }
        return draws;
    }

    public void print() {
        System.out.println(cards);
    }

    private void initCard() {
        List<Card> list = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            for (CardType value : CardType.values()) {
                list.add(new Card(value, i));
            }
        }
        Collections.shuffle(list);
        cards.addAll(list);
    }
}
