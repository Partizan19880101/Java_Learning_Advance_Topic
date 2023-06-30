package javaAdvance.multithreading;

public class DeadLockExample {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread10();
        Thread thread2 = new Thread20();
        thread1.start();
        thread2.start();
    }
}

class Thread10 extends Thread {
    public void run() {
        System.out.println("Thread10: attempt to capture monitor of Object lock1");
        synchronized (DeadLockExample.lock1) {
            System.out.println("Thread10: capture monitor of Object lock1");

            System.out.println("Thread10: attempt to capture monitor of Object lock2");
            synchronized (DeadLockExample.lock2) {
                System.out.println("Thread10: capture monitor of ObjectS lock1 and lock2");
            }
        }
    }
}

class Thread20 extends Thread {
    public void run() {
        System.out.println("Thread20: attempt to capture monitor of Object lock2");
        synchronized (DeadLockExample.lock1) {
            System.out.println("Thread20: capture monitor of Object lock2");

            System.out.println("Thread20: attempt to capture monitor of Object lock1");
            synchronized (DeadLockExample.lock2) {
                System.out.println("Thread20: capture monitor of ObjectS lock1 and lock2");
            }
        }
    }
}