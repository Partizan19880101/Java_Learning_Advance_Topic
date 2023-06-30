package javaAdvance.lambda;

public class LambdaExample2 {
    static void def(I i){
        System.out.println(i.abc("Hello"));
    }

    public static void main(String[] args) {
        int i = 10;
        def((String str) -> str.length());
        def(s -> s.length() + i);
    }
}
interface I {
    int abc(String s);
}
