package test;

import java.util.Scanner;

public class TemperatureCelsiusInFahrenheit {

    public static Object temperature() {
        float temperature;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperatue in Fahrenheit");
        temperature = in.nextInt();
        temperature = ((temperature - 32)*5)/9;
        System.out.println("Temperatue in Celsius = " + temperature);
        return null;
    }
}
