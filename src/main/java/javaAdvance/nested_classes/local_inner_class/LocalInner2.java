package javaAdvance.nested_classes.local_inner_class;

public class LocalInner2 {

    public static void main(String[] args) {
        class Sum implements Math2 {
            @Override
            public int doOperation(int a, int b) {
                return a / b;
            }
        }
        Sum sum = new Sum();
        int result = sum.doOperation(30, 5);
        System.out.println(result);
    }
}
interface Math2 {
    int doOperation(int a, int b);
}