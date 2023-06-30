package live_coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMinIntInArrray {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 6, 7, 8,-4));

        maxInt(list);
        minInt(list);
    }
    public static void maxInt(List list){
        System.out.println("Max number is " + Collections.max(list));
    }
    public static void minInt(List list){
        System.out.println("Min number is " + Collections.min(list));
    }
}
