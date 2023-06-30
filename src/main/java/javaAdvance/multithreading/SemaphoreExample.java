package javaAdvance.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Pavel", callBox);
        new Person("Yulia", callBox);
        new Person("Sergey", callBox);
        new Person("Anton", callBox);
        new Person("Sveta", callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public void run() {
        try {
            System.out.println("Person wait " + name + "...");
            callBox.acquire();
            System.out.println("Person " + name + " use a phone");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            callBox.release();
        }
    }
}