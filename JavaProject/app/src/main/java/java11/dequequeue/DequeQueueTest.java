package java11.dequequeue;

public class DequeQueueTest {
    public static void main(String[] args) {
        QueueTicketDispenser.takeNum();
        QueueTicketDispenser.takeNum();
        QueueTicketDispenser.takeNum();
        QueueTicketDispenser.takeNum();
        QueueTicketDispenser.takeNum();

        System.out.println("첫번째 손님은 " + Restaurant.firstGuest() + "번 손님입니다. ");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        Restaurant.printQueue();
        
        while (Restaurant.q.size() > 0) {
            Restaurant.serving();
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Restaurant.printQueue();

        System.out.println("Deque는 양방향으로 추가 및 삭제가 가능하다.");
    }
}
