package java12.consumer01;

import java.util.function.ObjIntConsumer;

public class ObjectIntConsumerTest {
    public static void main(String[] args) {
        ObjIntConsumer<String> c = (s, i) ->System.out.println(i + ", " + s);

        int n = 1;
        c.accept("Java", n++);
        c.accept("Spring Boot", n++);
        c.accept("Lambda Expression", n);
        System.out.println(n);
    }
}
