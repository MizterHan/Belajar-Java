package programmer.zaman.now.collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {


        Queue<String> queue = new PriorityQueue<>(10);

        queue.add("Eko");
        queue.add("Kurniawan");
        queue.add("Khannedy");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
