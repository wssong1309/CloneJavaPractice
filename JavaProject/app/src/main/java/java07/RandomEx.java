package java07;

import java.util.Random;

public class RandomEx {
  public static void main(String[] args) {
    Random random = new Random();

    for (int i = 0; i < 5; i++) {
      System.out.print(random.nextInt(45) + 1 + " ");
    }
  }
}
