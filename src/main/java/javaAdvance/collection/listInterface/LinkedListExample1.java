package javaAdvance.collection.listInterface;

import java.util.LinkedList;

public class LinkedListExample1 {

    public static void main(String[] args) {
        Student2 student1 = new Student2("Sveta", 2);
        Student2 student2 = new Student2("Pavel", 1);
        Student2 student3 = new Student2("Lena", 3);
        Student2 student4 = new Student2("Datya", 0);

        LinkedList<Student2> linkedList = new LinkedList<>();
        linkedList.add(student1);
        linkedList.add(student2);
        linkedList.add(student3);
        linkedList.add(student4);
        for (Student2 s : linkedList) {
            System.out.println(s);
        }
        System.out.println("____________________________");
//        System.out.println(linkedList.get(2));
        Student2 student5 = new Student2("Yura", 5);
        Student2 student6 = new Student2("Tolya", 4);
        linkedList.add(student5);
        linkedList.add(1, student6);
        linkedList.remove(3);
        for (Student2 s : linkedList) {
            System.out.println(s);
        }

    }
}

class Student2 {
    private String name;
    private int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
            "name='" + name + '\'' +
            ", course=" + course +
            '}';
    }
}