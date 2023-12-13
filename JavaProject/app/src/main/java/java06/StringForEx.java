package java06;

public class StringForEx {
  public static void main(String[] args) {
    int i = 33;

    System.out.println("int value : " + i);

    // int + String + int
    System.out.println(33 + 11 + "Java" + 3 + 5); // String 다음에 오는 primitive data type은 String으로 자동 형변환됨.
  }
}