package javaAdvance.nested_classes.anonymous_class;

import lombok.Data;

public class AnonymousClass {

    public static void main(String[] args) {

        Math3 m = new Math3() {
            int c = 10;
            void abc(){}
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        Math3 m2 = new Math3() {
            @Override
            public int doOperation(int a, int b) {
                return a / b;
            }
        };
        System.out.println(m.doOperation(6, 3));
        System.out.println(m2.doOperation(21, 3));
    }

}
interface Math3 {
    int doOperation(int a, int b);
}