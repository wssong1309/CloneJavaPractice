package java04.inheritancetest;

public class CarUserEx {
  public static void main(String[] args) {
    // Car object 생성
    Car myCar = new Car();

    // tire object 장착
    myCar.tire = new Tire();
    myCar.run();

    // HankookTire 장착
    myCar.tire = new HankookTire();
    myCar.run();

    // KumhoTire 장착
    myCar.tire = new KumhoTire();
    myCar.run();
  }
}
