package javaAdvance.regular_expression;

import java.util.Arrays;

public class Regex3 {

    public static void main(String[] args) {
        String s = "De Bruyne London, baker street, postcode 345045, 32 deBreune@gmail.com +047583459 "
                        + "Pavel Zuyonak Antalya, Muratpasha street 56, postcode 87666, zuyonak88@gmail.com +375291877809"
                        + "Vorobei Yurii, Minsk Lopatina 6 132, postcode 211511:, vorobei@gmail.com +375291441441";
        String s2 = "zuyonak88@gmail.com";

        boolean result = s2.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);

        String [] array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
