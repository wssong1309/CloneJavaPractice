package java03;

public class SwitchEx {
    public static void main(String[] args) {

        int num = (int)(Math.random()*6) + 1;

        switch (num) {
            case 1:
                System.out.println("주사위가 1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("주사위가 2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("주사위가 3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("주사위가 4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("주사위가 5번이 나왔습니다.");
                break;
            default:
                System.out.println("주사위가 6번이 나왔습니다.");
        }
    }
}
