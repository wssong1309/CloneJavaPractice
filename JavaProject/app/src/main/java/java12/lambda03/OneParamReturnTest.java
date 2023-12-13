package java12.lambda03;

public class OneParamReturnTest {
    // [3] one parameter, return
    public static void main(String[] args) {
        LengthCount lc = s -> s.length();
        System.out.println(lc.len("School of SmartIT!!"));
    }
}
