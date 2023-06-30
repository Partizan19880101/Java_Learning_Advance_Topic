package javaAdvance.multithreading;

import lombok.SneakyThrows;

public class Example8 extends Thread{
    @SneakyThrows
    @Override
    public void run() {
        for (int i = 1 ; i <= 10 ; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " = " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Run1());
        Thread thread2 = new Thread(new Example8());
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println("Finish");
    }
}
class Run1 implements Runnable {

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 1 ; i <= 10 ; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " = " + i);
        }
    }
}