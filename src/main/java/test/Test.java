package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {

//        System.out.println(sameString2("Pavel", "vel"));
//        System.out.println(sameString2("Pavel", "pa"));
//        System.out.println(time(4, 12, 33));
////        System.out.println(time2(4, 12, 33));
//        System.out.println(dictionary(2,3,4));
//        ArrayList<String> first = new ArrayList<>(List.of("ads", "dfg", "sdr"));
//        ArrayList<String> second = new ArrayList<>(List.of("ads", "dfg", "sdr", "asd"));
//        System.out.println(dictionary2(first, second));
    }

    public static boolean sameString(String str1, String str2) {
        return str1.endsWith(str2);
    }
    public static boolean sameString2(String str1, String str2) {
        if(str1.length() < str2.length())
            return false;
        int difference = str1.length() - str2.length();
        String differenceString = str1.substring(difference, str1.length());
        System.out.println(differenceString);
        return differenceString.equals(str2);
    }
    public static long time(int hours, int minutes, int seconds) {
        return TimeUnit.HOURS.toMillis(hours) + TimeUnit.HOURS.toMillis(minutes) + TimeUnit.SECONDS.toMillis(seconds);
    }
//    public static long time2(int hours, int minutes, int seconds) {
//        return (long) hours * 3600 * 1000 + (long) minutes * 60 * 1000 + seconds * 1000L ? hours < 24 : "Invalid time";
//    }

    public static Object dictionary(int ... number) {
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.put(5, "Five");
        numbers.put(6, "Six");
        numbers.put(7, "Seven");
        numbers.put(8, "eight");
        numbers.put(9, "Nine");

        for(int singleNumber : number) {
            System.out.println(numbers.get(singleNumber));
        }
        System.out.println("____________________");
        return null;
    }
    public static Map dictionary2(ArrayList<String> key, ArrayList<String> values) {
        Map<String, String> mapValues = new HashMap<>();
        for (int i = 0; i < key.size() && i < values.size(); i++) {
            mapValues.put(key.get(i), values.get(i));
        }
        if (key.size() > values.size()) {
            int difference = key.size() - values.size();
            for (int i = 0; i < difference; i++) {
                mapValues.put(key.get(key.size() - difference + i), null);
            }
            return mapValues;
        }
        if (values.size() > key.size()) {
            int difference = values.size() - key.size();
            for (int i = 0; i < difference; i++) {
                mapValues.put(values.get(values.size() - difference + i), null);
            }
        }
        return mapValues;
    }

}
