package java09;

public class Book implements Comparable<Book>{
  private int no;
  private String title;

  public Book(int no, String title) {
    this.no = no;
    this.title = title;
  }
  public int getNo() {
    return no;
  }
  public String getTitle() {
    return title;
  }

  @Override
  public int compareTo(Book book) {
    int result = Integer.valueOf(no).compareTo(book.getNo()) * -1;
    if (result == 0)
      result = title.compareTo(book.title);
    return result;
  }
  @Override
  public String toString() {
    return "(" + no + ", " + title + ")";
  }
}
