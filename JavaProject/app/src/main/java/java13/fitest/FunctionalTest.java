package java13.fitest;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalTest {
    public static void main(String[] args) {
        System.out.println("[1] Anonymous Class");
        // new 뒤에 Class이름 없이 Interface이름만 존재하므로 Anonymous Class
        Supplier<Integer> as = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 10);
            }
        };
        System.out.println(as.get());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("[2] Consumer Interface");
        Consumer<Integer> c = i -> System.out.println(i);
        c.accept(77);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("[3] Supplier Interface");
        Supplier<Integer> s = () -> (int) (Math.random() * 10);
        System.out.println(s.get());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("[4] Function Interface");
        Function<Integer, Double> f = i -> i / 2.0;
        System.out.println(f.apply(5));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("[5] Predicate Interface");
        Predicate<Integer> p1 = i -> i == 33;
        System.out.println(p1.test(3));

        Predicate<Integer> p2 = i -> i < 10;
        Predicate<Integer> p3 = i -> i < 20;
        Predicate<Integer> p4 = p1.or(p2.negate().and(p3)); // Short-Circuit Evaluation, method chaining
        System.out.println(p4.test(19));

        Predicate<String> p5 = Predicate.isEqual("OK");
        System.out.println(p5.test("ok"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("[6] UnaryOperator Interface");
        UnaryOperator<Integer> u = i -> i * 10;
        System.out.println(u.apply(33));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("[7] BiConsumer Interface");
        BiConsumer<String, Integer> bc1 = (str, i) -> System.out.println(str + " : " + i);
        bc1.accept("SmartIT", 33);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println("[8] BiFunction Interface");
        BiFunction<Integer, Integer, Double> bf = (i1, i2) -> i1 / (double) i2;
        System.out.println(bf.apply(33, 2));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
