package javaAdvance.regular_expression;

import lombok.AllArgsConstructor;

public class PrintfExample {

    static void EmployeeInfo(Employee employee) {
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n",
                employee.id, employee.name, employee.surname, employee.salary * (1 + employee.bonusPct));
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Pavel", "Zuyonak", 2185, 0.1);
        Employee employee2 = new Employee(1, "Uri", "Vorobei", 4000, 0.1);
        Employee employee3 = new Employee(1, "Sergei", "Karnauhov", 3500, 0.1);
        EmployeeInfo(employee);
        EmployeeInfo(employee2);
        EmployeeInfo(employee3);

        String newString = String.format("%03d \t %-12s \t %-12s \t %,.1f",
                1, "Pavel", "Zuyonak", 2185 * (1 + 0.15));
        System.out.printf(newString);
    }
}

@AllArgsConstructor
class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

}
