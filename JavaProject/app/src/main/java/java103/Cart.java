package java103;

// * 기호로 import하지 말 것. 항상 최적화
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Cart {
    private List<Book> books;

    // Default Constructor
    public Cart() {
        books = new ArrayList<Book>(); // 타입이 같을경우 <>안에 내용 생략 가능
    }

    public void add(Book book) { // 책을 카트에 추가
        books.add(book);
    }

    public void add(int index, Book book) { // 책을 순서를 정해서 카트에 추가
        books.add(index, book);
    }

    public boolean checkForDuplicate(Book book) { // 책을 중복해서 샀는지 체크
        return books.contains(book);
    }

    public List<Book> getAllBooks() { // 모든 책을 확인
        return books;
    }

    public Book getBook(int index) { // 인덱스로 책 찾기
        return books.get(index);
    }

    // [1] for i loop 방식으로 구매한 책 출력
    public static void printAllBooksWithFor(List<Book> books) {
        System.out.println("[1] for i loop 방식으로 출력");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(book);
        }
    }

    // [2] Iterator 방식으로 출력
    public static void printAllBooksWithIterator(List<Book> books) {
        System.out.println("[2] Iterator 방식으로 출력");
        for(Iterator<Book> it = books.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }

    // [3] ListIterator 방식으로 출력 (추천)
    public static void printAllBooksWithListIterator(List<Book> books) {
        System.out.println("[3] ListIterator 방식으로 출력");
        ListIterator<Book> it = books.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}