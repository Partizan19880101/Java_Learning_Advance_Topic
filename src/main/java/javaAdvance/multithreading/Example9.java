package javaAdvance.multithreading;

import lombok.SneakyThrows;

public class Example9 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        System.out.println("Work main begins");
        thread.start();
        System.out.println(thread.getState());
        thread.join(4000);
        System.out.println(thread.getState());
        System.out.println("Totally main finish");
    }
}

class Worker implements Runnable {

    @SneakyThrows
    @Override
    public void run() {
        System.out.println("Work begins");
        Thread.sleep(2500);
        System.out.println("Work finish");
    }
}