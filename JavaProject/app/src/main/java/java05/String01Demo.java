package java05;

public class String01Demo {
  public static void main(String[] args) {
    
    String s1 = "School of SmartIT!!"; // String Literal
    String s2 = "School of SmartIT!!";

    String s3 = new String("School of SmartIT!!");
    String s4 = new String("School of SmartIT!!");

    System.out.println(s1 == s2); // 결과값: true. value가 같아서 true가 아니라 s1, s2가 가리키는 주소가 같기때문이다.
    System.out.println(s3 == s4); // 결과값: false
  }
}