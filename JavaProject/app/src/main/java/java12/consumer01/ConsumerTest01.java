package java12.consumer01;

import java.util.function.Consumer;

public class ConsumerTest01 {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);

        c.accept("환영합니다. Consumer Practice입니다.");
        c.accept("Welcome to SmartIT!!");
    }
}
