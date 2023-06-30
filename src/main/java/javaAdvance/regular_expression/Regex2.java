package javaAdvance.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC"); //полное соответсвие
//        Pattern pattern1 = Pattern.compile("[ABC]"); соответсвие одного символа или а или в или с
//        Pattern pattern1 = Pattern.compile("A[B-Z]CD"); //[B-Z] любое значение (одной из букв) в промежутке
        String s1 = "ABDABABFBABADFG";
//        Pattern pattern1 = Pattern.compile("abс[^e-g4-7]"); //Диапазоны по одному знаения (тут 3 знака) ^ - отрицание
//        Pattern pattern1 = Pattern.compile("abс[d|5]"); // | - или
//        Pattern pattern1 = Pattern.compile("abс."); //. соответвует любому симолу
//        Pattern pattern1 = Pattern.compile("^abс"); //^ соответвует началу строки
//        Pattern pattern1 = Pattern.compile("5abcg$"); //^ соответвует концу строки
//        Pattern pattern1 = Pattern.compile("[0-9]"); //любую цифру
//        Pattern pattern1 = Pattern.compile("\\d"); //соответвует одной цифре
//        Pattern pattern1 = Pattern.compile("\\D"); //соответвует НЕ цифре
//        Pattern pattern1 = Pattern.compile("\\w"); //все кроме пробела, замена: [A-Za-z0-9_]
//        Pattern pattern1 = Pattern.compile("\\W"); //выведутся все символы не из [A-Za-z0-9_]
//        Pattern pattern1 = Pattern.compile("\\w{4}"); //слова из 4 символов
//        Pattern pattern1 = Pattern.compile("\\w\\s+\\w"); //симвод + пробелы все + символ (1)
//        Pattern pattern1 = Pattern.compile("\\AABDA"); //соответсвует началу стринга
        Pattern pattern1 = Pattern.compile("BADFG\\Z"); //соответсвует концу стринга

        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position " + matcher.start() + " : " +matcher.group());
        }
    }
}
