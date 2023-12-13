package java02;

public class CharEx {
    public static void main(String[] args) {
        char s1 = 'A'; // char DataType은 ""을 쓸 수 없다.
        char s2 = 65; // unicode 
        char s3 = '가'; // 한글 문자
        char s4 = 44032; // unicode 한글 문자

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("s4: " + s4);
    }
}
