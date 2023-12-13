package middletest.prob04;

public abstract class Controller {
  boolean power;

  public Controller(boolean power) {
    this.power = power;
  }

  public void show() {
    if (power == true)
      System.out.println(getName() + "가 켜졌습니다.");
    else
      System.out.println(getName() + "가 꺼졌습니다.");
  }

  abstract String getName();
}
