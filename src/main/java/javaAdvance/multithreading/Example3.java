package javaAdvance.multithreading;

public class Example3 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyTread3());
        Thread thread2 = new Thread(new MyTread4());
        thread1.start();
        thread2.start();
    }
}

class MyTread3 implements Runnable {
    public void run() {
        for(int i = 1; i <= 1000 ; i ++) {
            System.out.println("Number of 1 thread = " + i);
        }
    }
}

class MyTread4 implements Runnable {
    public void run() {
        for(int i = 1000; i >=0 ; i --) {
            System.out.println("Number of 2 thread = " + i);
        }
    }
}