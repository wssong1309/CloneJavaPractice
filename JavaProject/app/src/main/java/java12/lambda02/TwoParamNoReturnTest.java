package java12.lambda02;

public class TwoParamNoReturnTest {
    // [2] two parameters, return void
    public static void main(String[] args) {
        Calculate c;

        c = (x, y) -> System.out.println(x + y);
        c.cal(9, 3);

        c = (x, y) -> System.out.println(x - y);
        c.cal(9, 3);

        c = (x, y) -> System.out.println(x * y);
        c.cal(9, 3);

        c = (x, y) -> System.out.println(x / y);
        c.cal(13, 3);
    }
}
