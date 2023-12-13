package java12.lambda01;

public class OneParamNoReturnTest {
    // [1] one parameter, return void
    public static void main(String[] args) {
        Printable p;

        // (1) 줄임이 없이 표현
        p = (String s) -> { System.out.println(s); };
        p.print("환영합니다. Lambda Expression 과정(1) 입니다.");
        
        // (2) 실행문이 하나라면 "{};" 중괄호 생략 가능
        p = (String s) -> System.out.println(s);
        p.print("환영합니다. Lambda Expression 과정(2) 입니다.");

        // (3) parameter가 하나라면 parameter type 생략 가능
        p = (s) -> System.out.println(s);
        p.print("환영합니다. Lambda Expression 과정(3) 입니다.");
        
        // (4) parameter가 하나라면 parameter의 "()" 괄호도 생략 가능
        p = s -> System.out.println(s);
        p.print("환영합니다. Lambda Expression 과정(4) 입니다.");
    }
}
