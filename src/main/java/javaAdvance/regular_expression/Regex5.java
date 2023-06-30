package javaAdvance.regular_expression;

public class Regex5 {

    public static void main(String[] args) {
        String s1 = "Hello     my Friend! How about    learning    java";
        System.out.println(s1);
        s1 = s1.replace("java", "SQL");
        s1 = s1.replaceAll(" {2,}", " ");
//        s1 = s1.replaceAll("\\bH\\w+", "T");
        s1 = s1.replaceFirst("\\bH\\w+", "T");
        System.out.println(s1);
    }
}
