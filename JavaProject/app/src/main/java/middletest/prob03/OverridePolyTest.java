package middletest.prob03;

public class OverridePolyTest {
  public static void main(String[] args) {
    Car car = new Car("white", 300, 1500, 6);
    car.show();

    System.out.println();
    Vehicle vehicle = car;
    vehicle.show();
  }
}