package javaAdvance.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex6 {

    public static void main(String[] args) {
        String s1 = "12312312344253451234425;12312312344253451234425;12312312344253451234345";

        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(s1);
        String muNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)").replace(";", "\n");
        System.out.println(muNewString);

        while (matcher.find()) {
            System.out.println(matcher.group(7)); //только группа 7
        }
    }
}
