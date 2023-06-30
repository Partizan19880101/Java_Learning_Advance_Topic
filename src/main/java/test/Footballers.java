package test;

import java.util.Arrays;
import java.util.List;
import test.Footballer;

public class Footballers {

    public static void main(String[] args) {
        List<Footballer> footballers = Arrays.asList(
            new Footballer(22, "Aavel", "Lazio"),
            new Footballer(26, "Lustig", "Celtic"),
            new Footballer(24, "Bunnarson", "Ajax"));
        List<Footballer> result = footballers
            .stream()
//            .map(footballer -> footballer.name.toUpperCase());
            .sorted(((o1, o2) -> o1.name.compareTo(o2.name))).toList();
        System.out.println(result);

        System.out.println(timeRange(7));
    }

    public static String timeRange(int h) {
        return switch(h / 6) {
            case 0 -> "Доброй ночи! 0 - 6";
            case 1 -> "Доброе утро! 6 - 12";
            case 2 -> "Добрый день! 13 - 18";
            case 3 -> "Добрый вечер! 18 - 24";
            default -> "Здравствуйте";
        };
    }
}
