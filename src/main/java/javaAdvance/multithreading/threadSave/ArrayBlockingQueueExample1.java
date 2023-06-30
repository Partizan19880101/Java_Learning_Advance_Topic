package javaAdvance.multithreading.threadSave;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample1 {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        //queue.add(5); //exception
        queue.offer(5);
        System.out.println(queue);
    }
}
