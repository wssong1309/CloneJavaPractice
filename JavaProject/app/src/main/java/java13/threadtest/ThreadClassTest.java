package java13.threadtest;

//[1] Thread Class Inheritance하여 구현하는 방법 (X)
class NewThread extends Thread {
    private int number = 0;

    public NewThread(int n) {
        System.out.println(this.getName() + " : Thread 시작\n");
        number = n;
    }

    public void run() {
        int i = 0;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        while (i < number) {
            // Thread Body
            System.out.println(this.getName() + " : " + i + "\n");
            i++;
        }
        System.out.println(this.getName() + " : Thread 종료");
    }
}

public class ThreadClassTest {
    public static void main(String[] args) {
        // // (1) nt NewThread object를 생성
        // NewThread nt = new NewThread(5);

        // // (2) nt object를 start() 호출
        // nt.start();

        new NewThread(10).start();
    }
}
