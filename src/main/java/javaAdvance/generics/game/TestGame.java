//package javaAdvance.generics.game;
//
//public class TestGame {
//
//    public static void main(String[] args) {
//        Schoolboy schoolboy = new Schoolboy("Ivan" , 14);
//        Schoolboy schoolboy2 = new Schoolboy("Yana" , 15);
//        Schoolboy schoolboy3 = new Schoolboy("Sveta" , 12);
//        Schoolboy schoolboy4 = new Schoolboy("Lena" , 11);
//
//        Student student = new Student("Hleb", 23);
//        Student student2 = new Student("Yuri", 21);
//
//        Employee employee = new Employee("Kate", 32);
//        Employee employee2 = new Employee("Pavel", 35);
//
//        Team<Schoolboy> schoolboyTeam = new Team<>("Dragon");
//        schoolboyTeam.addNewParticipant(schoolboy);
//        schoolboyTeam.addNewParticipant(schoolboy2);
//
//        Team<Schoolboy> schoolboyTeam2 = new Team<>("Forrest");
//        schoolboyTeam.addNewParticipant(schoolboy3);
//        schoolboyTeam.addNewParticipant(schoolboy4);
//
//        Team<Student> studentTeam = new Team<>("Kavkaz");
//        studentTeam.addNewParticipant(student);
//        studentTeam.addNewParticipant(student2);
//
//        Team<Employee> employeeTeam = new Team<>("Vostok");
//        employeeTeam.addNewParticipant(employee);
//        employeeTeam.addNewParticipant(employee2);
//
//
//        schoolboyTeam.playWith(schoolboyTeam2);
//    }
//
//}
