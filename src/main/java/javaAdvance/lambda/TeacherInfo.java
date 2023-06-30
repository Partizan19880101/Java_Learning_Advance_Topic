package javaAdvance.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import javaAdvance.generics.game.Student;
import org.bouncycastle.voms.VOMSAttribute;

public class TeacherInfo {

    public static void main(String[] args) {
        Teachers teachers1 = new Teachers("Inga", 'F', 3, 28, 7.1);
        Teachers teachers2 = new Teachers("Olesya", 'F', 2, 48, 6.6);
        Teachers teachers3 = new Teachers("Ivana", 'F', 1, 22, 7.5);
        Teachers teachers4 = new Teachers("Olga", 'F', 5, 33, 6.1);
        Teachers teachers5 = new Teachers("Lena", 'F', 4, 45, 6.3);


        ArrayList<Teachers> teachers = new ArrayList<>(Arrays.asList(teachers1, teachers2,teachers3, teachers4, teachers5));
        //Function start
        double result = avrSomething(teachers, stud -> stud.averageGrade);
        System.out.println(result);
        //Function end

        for (Teachers s : teachers){
            System.out.println(s);
        }
        Collections.sort(teachers, new Comparator<Teachers>() {
            @Override
            public int compare(Teachers s1, Teachers s2) {
                return s1.course - s2.course;
            }
        });
        System.out.println(teachers);
        Collections.sort(teachers, (x, y) -> x.course - y.course);
        System.out.println(teachers);

        testStudents(teachers, (Teachers t) -> t.age < 30);
        System.out.println("????????????");
        testStudents(teachers, t -> t.averageGrade < 7);
        testStudents(teachers, t -> t.averageGrade < 7 && t.age < 45 && t.sex == 'F');

        TeachersChecks tc = t -> t.averageGrade < 7;};


    static void testStudents(ArrayList<Teachers> s, Predicate<Teachers> tr) {
        for (Teachers t : s) {
            if (tr.test(t)) {
                System.out.println(t);
            }
        }
    }
    //Function start
    private static double avrSomething(List<Teachers> list, Function<Teachers, Double> f) {
        double result = 0;
        for (Teachers t : list) {
            result += f.apply(t);
        }
        return result = result / list.size();
    }
    //Function end
}
interface TeachersChecks {
    boolean check(Teachers t);
}
 class CheckOvergrade implements TeachersChecks {

    @Override
    public boolean check(Teachers t) {
        return t.averageGrade > 7;
    }
}