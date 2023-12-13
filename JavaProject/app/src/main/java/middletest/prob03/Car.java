package middletest.prob03;

public class Car extends Vehicle{
  int displacement, gears;

  public Car(String color, int speed, int displacement, int gears) {
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }
  
  public void show() {
    System.out.println("Car [color=" + color + ", speed=" + speed + ", displacement=" + displacement + ", gears=" + gears + "]");
  }
}
