package java13.generationsort;

import java.util.Comparator;

public class DescendingTitle implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) { // compare method를 사용하기위해 compareTo method를 사용
        // 책 제목으로 내림차순
        int result = Integer.valueOf(b1.getNo()).compareTo(b2.getNo());
        if (result == 0) { // 책 번호가 같다면
            // String class는 Comparable Interface를 구현하고 있다.
            result = b1.getTitle().compareTo(b2.getTitle()); // 책 제목을 기준으로 오름차순 정렬
        }
        return result;
    }
}
