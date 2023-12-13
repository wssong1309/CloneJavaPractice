package middletest.prob04;

public class Radio extends Controller{
  public Radio(boolean power) {
    super(power);
  }

  @Override
  String getName() {
    return "Radio";
  }
}
