package java09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    Collections.addAll(list, "S", "e", "m", "y", "u", "n", "g");
    Collections.sort(list); // 오름차순
    System.out.println(list);

    List<Book> books = new ArrayList<>();
    Collections.addAll(books, new Book(1, "Python"), new Book(1, "Java"), new Book(3, "Spring Boot"));
    Collections.sort(books); //내림차순
    System.out.println(books);
  }
}
