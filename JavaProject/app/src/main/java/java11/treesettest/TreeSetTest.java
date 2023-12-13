package java11.treesettest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> sets = Set.of("포도", "수박", "사과", "키위", "망고");
        HashSet<String> hashSet = new HashSet<>(sets);
        System.out.println(hashSet);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        // Binary Search Tree
        TreeSet<String> treeSet = new TreeSet<>(sets);
        System.out.println(treeSet);
    }
}
