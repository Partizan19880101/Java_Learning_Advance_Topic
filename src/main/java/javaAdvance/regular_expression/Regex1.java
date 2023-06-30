package javaAdvance.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

    public static void main(String[] args) {
        String regex =
                    "De Bruyne London, baker street, postcode 345045, 32 deBreune@gmail.com +047583459 "
                + "Pavel Zuyonak Antalya, Muratpasha street 56, postcode 87666, zuyonak88@gmail.com +375291877809"
                + "Vorobei Yurii, Minsk Lopatina 6 132, postcode 211511:, vorobei@gmail.com +375291441441";

//        Pattern pattern = Pattern.compile("\\w+"); //все кроме пробела, замена: [A-Za-z0-9_]
//        Pattern pattern = Pattern.compile("\\d{2}"); //две цифры идущие рядом
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b"); //две отдельные цифры
//        Pattern pattern = Pattern.compile("\\+\\d{9}"); //телефон из 9 цифр с плюсом
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)"); //шаблон для эмеэйла

        Matcher matcher = pattern.matcher(regex);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
