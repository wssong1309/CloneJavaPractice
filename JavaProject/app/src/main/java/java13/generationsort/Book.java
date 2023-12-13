package java13.generationsort;

/*
 * Domain(Entity) <-----> DataBase(Table == Relation)
 * 주의: Relational(관계형) <-----> Relation(테이블)
 * ORM(Object-Relational Mapping)
 */

public class Book implements Comparable<Book> {
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
        int result = Integer.valueOf(no).compareTo(book.getNo()) * -1; // Descending 정렬
        if (result == 0)
            result = title.compareTo(book.title);
        return result;
    }

    @Override
    public String toString() {
        return "Book [no=" + no + ", title=" + title + "]";
    }

}
