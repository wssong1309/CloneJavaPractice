package java11.dequequeue;

public class QueueTicketDispenser {
    private static int num = 1;
    
    public static int takeNum() {
        Restaurant.q.offer(num);
        return num++;
    }
}
