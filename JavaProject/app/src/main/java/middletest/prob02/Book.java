package middletest.prob02;

public class Book implements Comparable{
  // String title;
  // String author;
  int price;

  public Book(int price) {
    this.price = price;
  }

  @Override
  public int compareTo(Object obj) {
    Book book = (Book) obj;
    return Integer.compare(this.price, book.price);
  }

  @Override
  public String toString() {
    return "Book [cost=" + price + "]";
  }  
}
