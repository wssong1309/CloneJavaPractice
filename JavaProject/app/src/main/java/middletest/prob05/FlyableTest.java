package middletest.prob05;

public class FlyableTest{
  public static void main(String[] args) {
    Flyable f = new Flyable() {
      @Override
      public void height() {
        System.out.println("속도");        
      }

      @Override
      public void speed() {
        System.out.println("높이");        
      }
    };
    f.speed();
    f.height();
  }
}
