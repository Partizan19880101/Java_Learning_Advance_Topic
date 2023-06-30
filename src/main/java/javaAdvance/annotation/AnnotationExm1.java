package javaAdvance.annotation;

public class AnnotationExm1 {

    public static void main(String[] args) {
        Parent p = new Child("Pavel");
        p.showInfo();
    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    @Deprecated
    void showInfo() {
        System.out.println("In's Parent class, name = " + name);
    }
}

class Child extends Parent {

    public Child(String name) {
        super(name);
    }

//    @Override
    void showInfo() {
        System.out.println("In's Child class, name = " + name);
    }
}