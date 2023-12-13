package java12.lambdagenerics;

public class LambdaGenericsTest {
    public static void main(String[] args) {
        Calculate3<Integer> ci = (x, y) -> x + y;
        System.out.println(ci.cal(9, 3));

        Calculate3<Double> cd = (x, y) -> x + y;
        System.out.println(cd.cal(33.33, 22.22));
    }
}
