package java11.settest;

import java.util.HashSet;
import java.util.Set;

public class FruitSetTest {
    public static void main(String[] args) {
        Set<Fruit> fruits = new HashSet<>();
        fruits.add(new Fruit("사과"));
        fruits.add(new Fruit("사과"));
        
        System.out.println(fruits.size());
        System.out.println(fruits);
    }
}
