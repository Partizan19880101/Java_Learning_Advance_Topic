package javaAdvance.multithreading;

public class Example5 {

    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("Pavel thread");
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of myThread5 = " + myThread5.getName() +
                "\nPriority of MyThread5 = " + myThread5.getPriority());



    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}