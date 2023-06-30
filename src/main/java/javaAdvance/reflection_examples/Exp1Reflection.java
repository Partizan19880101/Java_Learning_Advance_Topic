package javaAdvance.reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Exp1Reflection {

    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("javaAdvance.reflection_examples.Employee"); // 1 метод создаем объект экземпляра класса класс
//        Class employeeClass2 = Employee.class; // 2 метод создаем объект экземпляра класса класс
//        Employee employee = new Employee(); // 3 метод создаем объект экземпляра класса класс
//        Class employeeClass3 = employee.getClass();

        Field field = employeeClass.getField("id");
        System.out.println("Type of id field is = " + field.getType());

//        Field [] fields = employeeClass.getFields();
//        for (Field field1 : fields) {
//            System.out.println("Type of " + field1.getName() + " = " + field1.getType());
//        }

        Field [] fieldsDeclared = employeeClass.getDeclaredFields();
        for (Field f : fieldsDeclared) {
            System.out.println("Type of " + f.getName() + " = " + f.getType());
        }
        System.out.println("____________________________");

        Method someMethod = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method = " + someMethod.getReturnType() + " parameter types = "
                + Arrays.toString(someMethod.getParameterTypes()));

        System.out.println("____________________________");

        Method setSalaryMethod = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method " + setSalaryMethod.getReturnType() + " parameter types = "
                + Arrays.toString(setSalaryMethod.getParameterTypes()));

        System.out.println("____________________________");

        Method [] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.println("Name of method = " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    ", parameter type = " + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("____________________________");

        Method [] methods2 = employeeClass.getDeclaredMethods();
        for (Method method : methods2) {
            System.out.println("Name of method = " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    ", parameter type = " + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("____________________________");

        Method [] methods3 = employeeClass.getDeclaredMethods();
        for (Method method : methods3) {
            if (!Modifier.isPrivate(method.getModifiers())) {
                System.out.println("Name of method = " + method.getName() +
                        ", return type = " + method.getReturnType() +
                        ", parameter type = " + Arrays.toString(method.getParameterTypes()));
            }
        }
        System.out.println("+++++++++");
        Constructor getConstructor = employeeClass.getConstructor();
        System.out.println("Return count of constructor =  " + getConstructor.getParameterCount() + " parameters, their types are types = "
                + Arrays.toString(getConstructor.getParameterTypes()));


        System.out.println("+++++++++");
        Constructor getConstructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Return count of constructor =  " + getConstructor2.getParameterCount() + " parameters, their types are types = "
                + Arrays.toString(getConstructor2.getParameterTypes()));


        System.out.println("____________________________");

        Constructor [] constructors2 = employeeClass.getConstructors();
        for (Constructor constructor : constructors2) {
            System.out.println("Return count of constructor =  " + constructor.getParameterCount() + " parameters, their types are types = "
                    + Arrays.toString(constructor.getParameterTypes()) + "\n");
        }
    }
}
