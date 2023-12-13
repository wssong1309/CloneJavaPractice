package java04.interfacetest;

public class Car {
  // field
  Tire tire1 = new HankookTire();
  Tire tire2 = new KumhoTire();

  // method
  void run() {
    tire1.roll();
    tire2.roll();
  }
}
