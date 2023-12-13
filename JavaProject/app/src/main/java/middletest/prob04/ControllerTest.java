package middletest.prob04;

public class ControllerTest {
  public static void main(String[] args) {
    Controller[] c = { new TV(true), new Radio(false) };

    for (Controller controller : c) {
      controller.show();
    }
  }
}
