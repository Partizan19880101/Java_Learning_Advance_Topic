package javaAdvance.collection.listInterface;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Pavel");
        stack.push("Kate");
        stack.push("Lena");
        stack.push("Olya");
        System.out.println(stack);
//        while (!stack.isEmpty())
//            System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.peek());

        System.out.println(stack);
    }

}
