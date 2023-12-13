package java06;

// method overriding
class Parent {
  public void info() {
    System.out.println("부모 클래스 입니다.");
  }
}

class Child extends Parent {
  public void info() {
    super.info();
    System.out.println("자식 클래스 입니다.");
  }
}

public class OverridingTest {
  public static void main(String[] args) {
    Child son = new Child();
    son.info();
  }
}
