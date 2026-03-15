package collection.comapre.test;

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player p1 = new Player("플레이어1");
        Player p2 = new Player("플레이어2");

        p1.drawCard(deck);
        p2.drawCard(deck);

        p1.showHand();
        p2.showHand();

        getWinner(p1, p2);
    }

    private static void getWinner(Player p1, Player p2) {
        if (p1.score() > p2.score()) {
            System.out.println(p1.name() + " 승리");
        } else if (p1.score() < p2.score()) {
            System.out.println(p2.name() + " 승리");
        } else {
            System.out.println("무승부");
        }
    }
}
