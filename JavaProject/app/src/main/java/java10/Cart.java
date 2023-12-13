package java10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cart<T> { // <T> Type Parameter
    private List<T> items;

    public Cart() { // [1] Collection에서 Generics사용
        items = new ArrayList<T>();
    }

    public Cart(T[] arr) { // [2] parameter의 type으로 Generics사용
        items = new ArrayList<>(Arrays.asList(arr));
    }

    public void add(T item) { // [3] method의 parameter type으로 사용
        items.add(item);
    }

    public T get(int index) { // [4] method의 return type으로 사용
        return items.get(index);
    }

    public void printAllItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
