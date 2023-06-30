package javaAdvance.generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {

    public static void main(String[] args) {
        List<?> list = new ArrayList<>();


        List<String> list1 = new ArrayList<>();
        list1.add("Pavel");
        showInfo(list1);

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(3.14);
        list2.add(4.13);
        showInfo(list2);
        System.out.println(sumNumberList(list2));
    }
    public static void showInfo(List<?> list){
        System.out.println("My list consist of next elements: " + list);
    }

    public static double sumNumberList(ArrayList<? extends Number> list) {
        double sumNumberList = 0;
        for (Number n : list) {
            sumNumberList += n.doubleValue();
        }
        return sumNumberList;
    }
}
