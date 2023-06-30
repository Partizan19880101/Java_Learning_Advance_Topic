package javaAdvance.multithreading;

public class DeamonExample {

    public static void main(String[] args) {
        System.out.println("Main Thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("user_thread");

        DeamonThread deamonThread = new DeamonThread();
        deamonThread.setName("deamon_thread");
        deamonThread.setDaemon(true);
        userThread.start();
        deamonThread.start();
        System.out.println("Main Thread ends");

    }
}

class UserThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is deamon: " + isDaemon());
        for (char i = 'A'; i <= 'J' ; i ++) {
            try {
                Thread.sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class DeamonThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is deamon: " + isDaemon());
        for (int i = 1; i <= 1000 ; i ++) {
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}