package collection.set.javaset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsMain {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        add(hashSet);
        add(linkedHashSet);
        add(treeSet);

        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }

    private static void add(Set<Integer> set) {

        set.add(1);
        set.add(77);
        set.add(1000);
        set.add(500);
        set.add(398943);
        set.add(23892);
    }
}
