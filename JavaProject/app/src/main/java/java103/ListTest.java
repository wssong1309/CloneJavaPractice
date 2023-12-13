package java103;

import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        Book b1 = new Book("Java List Interface", "리스트 출판사");
        Book b2 = new Book("Java Collection Interface", "컬렉션 출판사");
        Book b3 = new Book("Spring Boot", "스프링 출판사");

        Cart cart = new Cart();
        cart.add(b1);
        cart.add(b3);
        cart.add(1, b2);

        System.out.println(cart.checkForDuplicate(b1));
        Book b4 = new Book("Spring Framework", "세명출판사");
        System.out.println(cart.checkForDuplicate(b4));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(cart.getBook(2));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        List<Book> books = cart.getAllBooks();
        System.out.println(books.toString()); // toString() method는 Array를 return
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [1] for i loop
        Cart.printAllBooksWithFor(books);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [2] Iterator
        Cart.printAllBooksWithIterator(books);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [3] ListIterator
        Cart.printAllBooksWithListIterator(books);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
    }
}
