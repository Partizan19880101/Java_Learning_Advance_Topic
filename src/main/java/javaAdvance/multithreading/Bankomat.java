package javaAdvance.multithreading;

import java.util.PriorityQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Pavel", lock);
        new Employee("Elena", lock);
        Thread.sleep(5000);
        new Employee("Marta", lock);
        new Employee("Ekaterina", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }
    public void run() {
        if (lock.tryLock()) {
            try {
                //System.out.println(name + " wait...");
                //lock.lock();
                System.out.println(name + " using bankomat");
                Thread.sleep(2000);
                System.out.println(name + " is finished his job");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " do not want to wait in a queue");
        }
    }
}