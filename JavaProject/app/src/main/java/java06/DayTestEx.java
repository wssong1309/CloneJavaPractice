package java06;

import java.util.Scanner;

public class DayTestEx {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();

    Day day = Day.valueOf(s.toUpperCase());

    dayLike(day);
  }

  public static void dayLike(Day day) {
    switch (day) {
      case MONDAY:
        System.out.println("월요일은 싫다.");
        break;
      case FRIDAY:
        System.out.println("금요일은 좋다.");
        break;
      case SATERDAY:
      case SUNDAY:
        System.out.println("주말은 최고.");
        break;
      default:
        System.out.println("주중은 그저 그렇다.");
    }
  }

  enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATERDAY
  }
}
