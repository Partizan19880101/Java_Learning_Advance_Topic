package javaAdvance.work_with_files.programmer1;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Employee implements Serializable {
    static final long serialVersionUID = 2;
    String name;
    String surname;
    String department;
    //int age;
    transient double salary;
    Car car;
}
