package javaAdvance.collection.listInterface;

import java.util.ArrayList;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

public class ArrayListMethods2 {

    public static void main(String[] args) {
        Student student1 = new Student("Pavel", 'M', 35, 3, 7.33);
        Student student2 = new Student("Nastya", 'F', 25, 3, 5.38);
        Student student3 = new Student("Yana", 'F', 34, 3, 7.66);
        Student student4 = new Student("Sveta", 'F', 22, 2, 5.24);
        Student student5 = new Student("Vasilisa", 'F', 23, 3, 3.66);
        Student student6 = new Student("Vasilisa", 'F', 23, 3, 3.66);
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);

        Student h = Student.builder().age(23).sex('m').name("Lee").build();
//        studentsList.add(student6);
        for (Student s : studentsList) {
            System.out.println(s);
        }
        System.out.println("\n");
        studentsList.remove(student6);
        for (Student s : studentsList) {
            System.out.println(s);
        }
    }

}
@Data
@Builder
@EqualsAndHashCode
@AllArgsConstructor()
//@EqualsAndHashCode(of = {"sex", "age"})
@ToString(of = {"name", "sex", "age", "course", "average"})
class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double average;



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course
            && Double.compare(student.average, average) == 0 && Objects.equals(name,
            student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, course, average);
    }
}
