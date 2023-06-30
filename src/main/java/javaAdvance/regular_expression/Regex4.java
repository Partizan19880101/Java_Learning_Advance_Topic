package javaAdvance.regular_expression;

import java.util.regex.Pattern;

public class Regex4 {
    void checkIp(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}"
                + "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println(ip + " is ok? " + Pattern.matches(regex, ip));

        // 25[0-5]  between 250 - 255
        // 2[0-4] between 20 - 24 + 1 любая цифра
        // [01]?\d?\d    - 01 может быть или нет, + любая цифра от 0-9 может быть или + обязательно любая цифра
    }

    public static void main(String[] args) {
        String ip1 = "254.240.192.99";
        String ip2 = "224.254.192.23";
        String ip3 = "224.3!.19g.23";
        Regex4 regex4 = new Regex4();
        regex4.checkIp(ip1);
        regex4.checkIp(ip2);
        regex4.checkIp(ip3);
    }
}
