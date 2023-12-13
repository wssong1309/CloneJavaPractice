package java12.predicate01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest01 {

    // sum(Predicate parameter, List Collection)
    static int sum(Predicate<Integer> p, List<Integer> lst) {
        int s = 0;
        for (int n : lst) {
            if (p.test(n)) {
                s += n;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);

        int s;

        s = sum(n -> n % 2 == 0, list);
        System.out.println("짝수의 합: " + s);

        s = sum(n -> n % 2 != 0, list);
        System.out.println("홀수의 합: " + s);
    }
}
