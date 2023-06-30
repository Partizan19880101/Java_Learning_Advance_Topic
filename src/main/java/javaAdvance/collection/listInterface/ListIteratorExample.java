package javaAdvance.collection.listInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        String s = "dad";
        String b = "dady";
        List<Character> linkedList = new LinkedList<>();
        for (char ch : b.toCharArray()){
            linkedList.add(ch);
        }
        System.out.println(linkedList);
        ListIterator<Character> listIterator = linkedList.listIterator();
        ListIterator<Character> reverseListIterator = linkedList.listIterator(linkedList.size());
        boolean isPalindrome = true;
        while (listIterator.hasNext() && reverseListIterator.hasPrevious()) {
            if (listIterator.next() != reverseListIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("is not palindrome");
        }
    }
}
