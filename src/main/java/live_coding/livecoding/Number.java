package live_coding.livecoding;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        String str = String.valueOf(a);
        String str2 = a + String.valueOf(a);
        String str3 = a + String.valueOf(a) + a;
        int b = Integer.parseInt(str) + Integer.parseInt(str2) + Integer.parseInt(str3);
        sc.close();
        System.out.println("Result: " + str + " + " + str2 + " + " + str3 + " = " + b);
    }
}
