package java03;

public class IfElseIfElseEx {
    public static void main(String[] args) {
        int score = 80; //변수 = field, 이렇게 개발자가 임의로 데이터를 할당하는 것을 더미 코딩이라고 한다.

        if (score >= 95) {
            System.out.println("A+");
        } else if (score >= 90) {
            System.out.println("A0");
        } else if (score >= 85) {
            System.out.println("B+");
        } else if (score >= 80) {
            System.out.println("B0");
        } else if (score >= 75) {
            System.out.println("C+");
        } else if (score >= 70) {
            System.out.println("C0");
        } else if (score >= 65) {
            System.out.println("D+");
        } else if (score >= 60) {
            System.out.println("D0");
        } else {
            System.out.println("F");
        }
    }
}
