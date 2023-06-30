package javaAdvance.multithreading;

public class VolotileEx extends Thread{

    volatile boolean b = true;
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished, counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolotileEx thread = new VolotileEx();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 sec it is time to wake up");
        thread.b = false;
        thread.join();
        System.out.println("End of program");
    }
}
