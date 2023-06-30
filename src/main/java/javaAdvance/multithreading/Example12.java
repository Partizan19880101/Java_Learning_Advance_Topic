package javaAdvance.multithreading;

import lombok.SneakyThrows;

public class Example12 {
//    static final Call call = new Call();
        static final Object lock = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsUp());
        thread1.start();
        thread2.start();
        thread3.start();
    }

    void mobileCall() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        }
    }
    void skypeCall() throws InterruptedException {
        synchronized (lock) {
            System.out.println("skype call starts");
            Thread.sleep(5000);
            System.out.println("skype call ends");
        }
    }
    void whatsUpCall() throws InterruptedException {
        synchronized (lock) {
            System.out.println("whatsUp call starts");
            Thread.sleep(7000);
            System.out.println("whatsUp call ends");
        }
    }
}

class RunnableImplMobile implements Runnable {

    @SneakyThrows
    @Override
    public void run() {
        new Example12().mobileCall();
    }
}
class RunnableImplSkype implements Runnable {

    @SneakyThrows
    @Override
    public void run() {
        new Example12().skypeCall();
    }
}
class RunnableImplWhatsUp implements Runnable {

    @SneakyThrows
    @Override
    public void run() {
        new Example12().whatsUpCall();
    }
}
//class Call {
//
//}