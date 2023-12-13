package java12.predicate01;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

public class PredicateTest02 {

    // sum(IntPredicate parameter, List Collection)
    static int sum(IntPredicate ip, List<Integer> lst) {
            int s = 0;
            for (int n : lst) {
                if (ip.test(n)) {
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
