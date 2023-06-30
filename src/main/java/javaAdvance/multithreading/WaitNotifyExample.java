package javaAdvance.multithreading;

import io.cucumber.java.it.Ma;
import javax.swing.TransferHandler;
import lombok.SneakyThrows;

public class WaitNotifyExample {

    public static void main(String[] args) {
        Market market = new Market();
        Consumer consumer = new Consumer(market);
        Producer producer = new Producer(market);

        Thread thread1 = new Thread(consumer);
        Thread thread2 = new Thread(producer);
        thread1.start();
        thread2.start();
    }
}
class Market {
    private int breadCount = 0;
    public synchronized void getBread() throws InterruptedException {
        while (breadCount < 1) {
            wait();
        }
        breadCount--;
        System.out.println("Customer buy one Bread");
        System.out.println("In the market we have = " + breadCount + " breads");
        notify();
    }
    public synchronized void putBread() throws InterruptedException {
        while (breadCount >= 5) {
            wait();
        }
        breadCount++;
        System.out.println("Producer added one bread in the market");
        System.out.println("In the market we have = " + breadCount + " breads");
        notify();
    }
}
class Producer implements Runnable {
    Market market;
    Producer(Market market) {
        this.market = market;

    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}
class Consumer implements Runnable {
    Market market;
    Consumer(Market market) {
        this.market = market;

    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}