package javaAdvance.generics;

import java.util.ArrayList;
import java.util.List;

public class SubTyping {

    public static void main(String[] args) {
        X x = new Y();
        List<X> list = new ArrayList<>();

    }
}

class X {

}

class Y extends X {

}