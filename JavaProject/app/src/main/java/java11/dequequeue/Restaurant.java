package java11.dequequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Restaurant {
    public static Deque<Integer> q = new ArrayDeque<>();

    public static void serving() {
        int num = q.poll();
        System.out.println(num + "번 손님에게 서빙되었습니다.");
    }

    public static void printQueue() {
        System.out.println("대기열\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Iterator<Integer> it = q.iterator(); it.hasNext();) {
            int num = it.next();
            System.out.println(num + "번 손님");
        }
        System.out.println();
    }

    public static int firstGuest() {
        return q.peek();
    }
}
