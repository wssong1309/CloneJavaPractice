package java07;

import java.util.StringTokenizer;

public class StringTokenizerEx {
  public static void main(String[] args) {
    String string = "of the people, by the people, for the people";
    StringTokenizer st = new StringTokenizer(string, ", ");

    System.out.println(st.countTokens());

    while(st.hasMoreTokens()) {
      System.out.print("[" + st.nextToken() + "] ");
    }
  }
}
