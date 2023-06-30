package javaAdvance.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Pavel");
        queue.offer("Sveta");
        queue.offer("Lena");
        queue.offer("Kate");

        System.out.println(queue);
        queue.remove();
        System.out.println(queue.element());
        queue.poll();
        System.out.println(queue.element());

        queue.poll();
        System.out.println(queue.element());
        queue.poll();
        queue.poll();
        System.out.println(queue); //Fifo
    }
}
