package javaAdvance.multithreading;

public class SynchronizeBlock2 {
    static int counter = 0;

    public static void increment() {
        synchronized(SynchronizeBlock2.class) {
            Example11.counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());
        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}

class R2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            SynchronizeBlock2.increment();
        }

    }
}