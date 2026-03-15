package collection.comapre.test;

import java.util.Comparator;

public class PriorityComparator implements Comparator<CardType> {

    @Override
    public int compare(CardType o1, CardType o2) {
        return o1.priority() - o2.priority();
    }
}
