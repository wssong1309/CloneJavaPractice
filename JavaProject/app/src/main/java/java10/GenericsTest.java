package java10;

public class GenericsTest {
    public static void main(String[] args) {
        Book b1 = new Book("Java generics", "세명출판사");
        Book b2 = new Book("Spring Boot", "세명출판사");
        Book b3 = new Book("Spring Framework", "세명출판사");

        Cart<Book> cart = new Cart<Book>(); // <Book> Type Argument
        cart.add(b1);
        cart.add(b2);
        cart.add(b3);

        cart.printAllItems();
    }
}
