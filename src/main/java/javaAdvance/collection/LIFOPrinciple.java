package javaAdvance.collection;

import java.util.Stack;

public class LIFOPrinciple {

    public static void main(String[] args) {
        System.out.println("Main starts" + "\n");
        abc3();
        System.out.println("\n" + "Main ends");
    }
    static void abc1() {
        System.out.println("ABC1 starts");
        System.out.println("ABC1 ends");
}
    static void abc2() {
        System.out.println("ABC2 starts");
        abc1();
        System.out.println("ABC2 ends");
    }
    static void abc3() {
        System.out.println("ABC3 starts");
        abc2();
        System.out.println("ABC3 ends");
    }
}
