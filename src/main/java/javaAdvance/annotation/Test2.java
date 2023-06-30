package javaAdvance.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test2 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("main.java.javaAdvance.annotation.Test2.Xiaomi");
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println("Annotation info from Xiaomi class " + sm1.OS() + " : " + sm1.yearOfCompanyCreation());
    }
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "Android";
    int yearOfCompanyCreation() default 2010;
}

@SmartPhone
class Xiaomi {
    String model;
    Double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976 )
class Iphone {
    String model;
    Double price;
}