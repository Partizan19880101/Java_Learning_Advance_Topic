package javaAdvance.multithreading;

public class Example6 implements Runnable{

    public static void main(String[] args) {
        Thread thread = new Thread(new Example6());
        thread.start();
        System.out.println("This is method Main run, Thread name = " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("This is method run, Thread name = " + Thread.currentThread().getName());
    }
}
