package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeNumberInList {

    public static void main(String[] args) {

            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 6, 7, 8, -4));
            List<Integer> list1 = list.stream()
                .map(l -> (l * (-1)))
                .collect(Collectors.toList());
        System.out.println(list1);


        }
        public static void maxInt(List list){
            System.out.println("Max number is " + Collections.max(list));
        }
        public static void minInt(List list){
            System.out.println("Min number is " + Collections.min(list));
        }
    }