package collection.comapre.test;

public enum CardType {
    SPADE("♠", 0),
    HEART("♥", 1),
    DIAMOND("♦", 2),
    CLOVER("♣", 3);

    private final String emblem;
    private final int priority;

    CardType(String emblem, int priority) {
        this.emblem = emblem;
        this.priority = priority;
    }

    public String emblem() {
        return emblem;
    }

    public int priority() {
        return priority;
    }

    public int comparePriority(CardType o2) {
        PriorityComparator comparator = new PriorityComparator();
        return comparator.compare(this, o2);
    }
}
