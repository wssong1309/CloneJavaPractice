package java06;

class Test {
  //method overloading
  public void smart(int num) {
    System.out.println(num + "은 정수입니다.");
  }
  public void smart(double num) {
    System.out.println(num + "은 실수입니다.");
  }
  public void smart(String num) {
    System.out.println(num + "은/는 문자열입니다.");
  }
}

public class PolymorphismTest {
  public static void main(String[] args) {
    Test test = new Test();

    test.smart(33);
    test.smart(33.33);
    test.smart("SmartIT");
  }
}
