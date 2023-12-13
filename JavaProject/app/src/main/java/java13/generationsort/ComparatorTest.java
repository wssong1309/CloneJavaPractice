package java13.generationsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Encoding 공부
 * (1) ASCII Code (7bits)
 * (2) Unicode (2bytes)
 * (3) EUC-KR
 * (4) UTF-8 (3bytes)
 * (5) Emoji (4bytes)
 */

public class ComparatorTest {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Collections.addAll(books,
                new Book(1, "자바"),
                new Book(2, "파이썬"),
                new Book(2, "장고 프레임워크"),
                new Book(1, "Spring Boot"),
                new Book(3, "Linux")); // variable parameters(arguments)

        System.out.println("현재 books");
        System.out.println(books);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("[1] 번호 오름차순 정렬, 제목 오름차순 정렬");
        Collections.sort(books, new AsscendingNo());
        System.out.println(books);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("[2] 번호 내림차순 정렬, 제목 내림차순 정렬");
        Collections.sort(books,
                new Comparator<Book>() {
                    @Override
                    public int compare(Book b1, Book b2) {
                        int result = Integer.valueOf(b1.getNo()).compareTo(b2.getNo()) * -1;
                        if (result == 0) {
                            result = b1.getTitle().compareTo(b2.getTitle()) * -1;
                        }
                        return result;
                    }
                });
        System.out.println(books);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // p.420
        System.out.println("[3] Comparator.reverseOrder() method 사용");
        Collections.sort(books, Comparator.reverseOrder());
        System.out.println(books);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println("[4] Alphabet 내림차순으로 정렬");
        List<String> lists = new ArrayList<>();
        Collections.addAll(lists, "S", "e", "m", "y", "u", "n", "g");
        Collections.sort(lists, Comparator.reverseOrder());
        System.out.println(lists);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println("[5] 대소문자 상관없이 Alphabet 오름차순으로 정렬");
        Collections.sort(lists, String.CASE_INSENSITIVE_ORDER);
        System.out.println(lists);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
