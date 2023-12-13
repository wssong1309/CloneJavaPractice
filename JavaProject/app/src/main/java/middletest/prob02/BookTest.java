package middletest.prob02;

import java.util.Arrays;

public class BookTest{
  public static void main(String[] args) {
    Book[] books = { new Book(18000), new Book(35000), new Book(23000) };

    System.out.println("[Before Sorting]");
    for (Book book : books) {
      System.out.println(book);
    }
    
    System.out.println();

    Arrays.sort(books);

    System.out.println("[After Sorting]");
    for (Book book : books) {
      System.out.println(book);
    }
  }
}
