package collection.comapre.test;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private final String name;
    private final List<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void drawCard(Deck deck) {
        for (int i = 0; i < 5; i++) {
            hand.add(deck.draw());
        }
    }

    public void showHand() {
        hand.sort(null);
        System.out.println(name + "의 카드: " + hand + ", 합계: " + score());
    }

    public int score() {
        int score = 0;
        for (Card card : hand) {
            score += card.number();
        }
        return score;
    }

    public String name() {
        return name;
    }
}
