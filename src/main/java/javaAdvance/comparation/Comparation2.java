package javaAdvance.comparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javaAdvance.comparation.Employee.SalaryComparator;

public class Comparation2 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(11, "Pavel", "Zuyonk", 2600),
            new Employee(7, "Yuri", "Vorobey", 4000),
            new Employee(3, "Zhenia", "Vialenkova", 3500),
            new Employee(17, "Ahenia", "Aarpovich", 2000)
        );

        System.out.println("Before sorting \n" + employees);
//        Collections.sort(employees);
//        Collections.sort(employees, new IdComparator());
//        Collections.sort(employees, new NameComparator());

        Collections.sort(employees, new SalaryComparator());
        System.out.println("Before sorting \n" + employees);
    }
}
class Employee
    implements Comparable<Employee>
{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", salary=" + salary +
            '}';
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        if (this.id == anotherEmployee.id)
            return 0;
        else if (this.id < anotherEmployee.id)
            return -1;
        else return 1;
//        return this.id - anotherEmployee.id;
//        return this.id.compareTo(anotherEmployee.id);
//        int result = this.name.compareTo(anotherEmployee.name);
//        if(result == 0) {
//            result = this.surname.compareTo(anotherEmployee.surname);
//        }
//        return result;
    }
//static class IdComparator implements Comparator<Employee> {
//    @Override
//    public int compare(Employee emp1, Employee emp2) {
//        if (emp1.id == emp2.id)
//            return 0;
//        else if (emp1.id < emp2.id)
//            return -1;
//        else return 1;
//    }
//}
    static class NameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.name.compareTo(emp2.name);
        }
    }
    static class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.salary - emp2.salary;
        }
    }
}