package javaAdvance.multithreading;

public class InterruptionExample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts");
        Thread thread = new Thread(new InterruptedThread());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();

        thread.join();
        System.out.println("Main thread ends");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;
    public void run() {
        for (int i = 0; i < 1000000000; i++) {
            if (isInterrupted()) {
                System.out.println("Tread wants to interrupt");
                System.out.println("Decide ti interrupt our thread");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread want to interrupt while sleep, lets finish out thread");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}