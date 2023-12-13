package java12.lambda04;

public class TwoParamReturnTest {
    // [4] two parameters, return
    public static void main(String[] args) {
        Calculate2 c;

        // (1) 생략되기 전 표현
        c = (x, y) -> { return x + y; };
        System.out.println(c.cal(9, 3));

        // (2) 생략된 후 표현
        c = (x, y) -> x + y;
        System.out.println(c.cal(9, 3));
    }
}
