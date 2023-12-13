package middletest.prob03;

public class Vehicle {
  String color;
  int speed;

  public Vehicle(String color, int speed) {
    this.color = color;
    this.speed = speed;
  }

  void show() {
    System.out.println("Vehicle [color=" + color + ", speed=" + speed + "]");
  }
}
