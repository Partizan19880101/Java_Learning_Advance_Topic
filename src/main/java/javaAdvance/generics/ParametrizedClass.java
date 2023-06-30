package javaAdvance.generics;

import io.cucumber.java.sl.In;

public class ParametrizedClass {

    public static void main(String[] args) {
        Info<String> info = new Info<>("Pavel");
        Info<Integer> info2 = new Info<>(5);
        Info<Bus> info3 = new Info<>(new Bus());
        System.out.println(info);
        System.out.println(info2);

    }
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//    public void abc (Info<Integer> info) {
//        Integer s = info.getValue();
//    }
}
class Info <T>{
    private T value;

    public Info (T value) {
        this.value = value;
    }
    public String toString() {
        return "Our value: " + value;
    }
    public T getValue() {
        return value;
    }
}
class Parent {
    public void abc(Info<String> info) {
        String s = info.getValue();
    }
}
class Bus {

}