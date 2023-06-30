package javaAdvance.reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Exp2Reflection {

    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Class.forName("javaAdvance.reflection_examples.Employee");

//        Employee employeeObject = (Employee)employeeClass.newInstance();
//        System.out.println(employeeObject);

        Constructor<Employee> constructor = employeeClass.getConstructor();
        Employee obj = constructor.newInstance();

        Constructor<Employee> constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Employee obj2 = constructor2.newInstance(5, "Pavel", "Zuyonak");
        System.out.println(obj2);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 800.88);
        System.out.println(obj2);
    }
}
