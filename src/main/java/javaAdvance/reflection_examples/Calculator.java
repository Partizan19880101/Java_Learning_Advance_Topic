package javaAdvance.reflection_examples;

import io.cucumber.java.sl.In;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a, int b) {
        int result = a + b;
        System.out.println("Result sum = " + result);
    }

    void division(int a, int b) {
        int result = a / b;
        System.out.println("Result division = " + result);
    }

    void multiple(int a, int b) {
        int result = a * b;
        System.out.println("Result multiple = " + result);
    }

    void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Result subtraction = " + result);
    }
}

class TestCalculator {

    public static void main(String[] args)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("text100.txt")
        )){
            String methodName = bufferedReader.readLine();
            String firstArgument = bufferedReader.readLine();
            String secondArgument = bufferedReader.readLine();

            Calculator calculator = new Calculator();
            Class cl = calculator.getClass();
            Method sumMethod = null;

            Method [] methods = cl.getDeclaredMethods();
            for (Method myMethod : methods) {
                if (myMethod.getName().equals(methodName)) {
                    sumMethod = myMethod;
                }
            }
            sumMethod.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
