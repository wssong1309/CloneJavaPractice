package java13.threadtest;

//[2] Runnable Interface로 구현하는 방법 (O)
class NewRunnable implements Runnable {
    private int number = 0;

    // Constructor
    public NewRunnable(int n) {
        System.out.println("Thread-0" + " : Thread 시작\n");
        this.number = n;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < number) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            // Thread Body
            System.out.println("Thread-0" + " : " + i + "\n");
            i++;
        }
        System.out.println("Thread-0" + " : Thread 종료");
    }
}

public class RunnableInterfaceTest {
    public static void main(String[] args) {
        // // (1) nr NewRunnable object를 생성
        // NewRunnable nr = new NewRunnable(5);

        // // (2) nr object를 Thread(nr)를 입력한 후 t object를 생성
        // Thread t = new Thread(nr);

        // // (3) t Thread object에 start() 호출
        // t.start();

        new Thread(new NewRunnable(10)).start();
    }
}
