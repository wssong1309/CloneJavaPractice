package java06.java0602;

class Circle {
  int radius;
  
  void show() {
    System.out.println("반지름이 " + radius + "인 원이다.");
  }

  public Circle(int radius) {
    this.radius = radius;
  }
  
}

class ColoredCircle extends Circle {
  String color;

  void show() {
    System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
  }

  public ColoredCircle(int radius, String color) {
    super(radius);
    this.color = color;
  }

}

public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(5);
    ColoredCircle c2 = new ColoredCircle(10, "빨간색");

    c1.show();
    c2.show();
  }
}

/**
 * [1] ; (semicolon) 사용법
 * (1) statement(문장) 끝에 사용
 * (2) anonymous class {}; --> Thread
 * 
 * [2] . (dot) 사용법
 * (1) DOS current directory
 * (2) obj.field
 * (3) obj.method()
 * 
 * cf. JavaScript : =>
 * [3] Java : -> (arrow notation) 사용법
 * (1) Functional programming
 * (2) Lambda expression
 * 
 * [Thread 사용법]
 * (1) Thread Class를 Inheritance하여 사용하는 방법 (X)
 * (2) Runnable Interface로 사용하는 방법 (O)
 */