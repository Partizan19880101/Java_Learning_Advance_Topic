package javaAdvance.reflection_examples;

import java.lang.reflect.Field;

public class Exp3Reflection {

    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(4, "Pavel", "IT");
        Class employeeClass = Class.forName("javaAdvance.reflection_examples.Employee");

        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue = (double) field.get(employee);
        System.out.println(salaryValue);
        field.set(employee, 1500);
        System.out.println(employee);
    }
}
