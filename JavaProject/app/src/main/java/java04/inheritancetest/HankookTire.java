package java04.inheritancetest;

public class HankookTire extends Tire {
  // method overriding
  @Override
  public void roll() {
    System.out.println("한국타이어가 회전합니다.");
  }
}
