package javaAdvance.generics;

import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator.PartyU;

public class ParametrizedClass2 {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Pavel", 35);
        System.out.println(pair);
        System.out.println("Name - " + pair.getFirstValue() + ", Age - " + pair.getSecondValue());

        Pair<Double, Long> pair2 = new Pair<>(3.14, 3456L);
        System.out.println("Double - " + pair2.getFirstValue() + ", Long - " + pair2.getSecondValue());
    }
}

class Pair <V1, V2> {
    private V1 value;
    private V2 value2;

    public Pair(V1 value, V2 value2) {
        this.value = value;
        this.value2 = value2;
    }
    public V1 abc(V1 value) {  //Parametrized method
        return value;
    }


    public String toString(){
        return "Our value: " + value + ", Age: " + value2;
    }
    public V1 getFirstValue() {
        return value;
    }
    public V2 getSecondValue() {
        return value2;
    }
}
