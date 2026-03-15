package collection.comapre.test;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private final String name;
    private final List<Card> hand = new ArrayList<>();
    private int score = 0;

    public Player(String name) {
        this.name = name;
    }

    public void drawCard(Deck deck) {
        hand.addAll(deck.draw());
        hand.sort(null);
    }

    public void showHand() {
        score = 0;
        for (Card card : hand) {
            score += card.number();
        }
        System.out.println(name + "의 카드: " + hand + ", 합계: " + score);
    }

    public String name() {
        return name;
    }

    public int score() {
        return score;
    }
}
