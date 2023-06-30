package javaAdvance.multithreading;

public class Example2 extends Thread{
        public void run() {
            for (int i = 1; i <= 1000; i++) {
                System.out.println("Number of 1 thread = " + i);
            }
        }
    public static void main(String[] args) {

        Example2 thread1 = new Example2();
        thread1.run();

        for(int i = 1000; i >=0 ; i --) {
            System.out.println("Number of 2 thread = " + i);
        }

//        MyTread1 myTread1 = new MyTread1();
//        MyTread2 myTread2 = new MyTread2();
//        myTread2.start();
//        myTread1.start();
    }
}

// class MyTread1 extends Thread {
//    public void run() {
//        for(int i = 1; i <= 1000 ; i ++) {
//            System.out.println("Number of 1 thread = " + i);
//        }
//    }
// }
//
//class MyTread2 extends Thread {
//    public void run() {
//        for(int i = 1000; i >=0 ; i --) {
//            System.out.println("Number of 2 thread = " + i);
//        }
//    }
//}