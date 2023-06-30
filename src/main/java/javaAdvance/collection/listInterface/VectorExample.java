package javaAdvance.collection.listInterface;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector<String> vector = new Vector();
        vector.add("Pavel");
        vector.add("Zuyonak");
        vector.add("Kate");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.remove(2));
        System.out.println(vector);
        System.out.println(vector.get(1));
    }

}
