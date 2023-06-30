package javaAdvance.collection.queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(3);
        System.out.println(arrayDeque);
        arrayDeque.addFirst(2);
        System.out.println(arrayDeque);
        arrayDeque.addLast(5);
        arrayDeque.offerLast(8);
        System.out.println(arrayDeque);
        arrayDeque.removeFirst();
        arrayDeque.removeLast();
        System.out.println(arrayDeque);
    }
}
