package javaAdvance.binarySearch;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class BinarySearchExample {

    public static void main(String[] args) {

        Empl empl1 = new Empl(2, "Pavel" ,2185);
        Empl empl2 = new Empl(4, "Yura" ,4000);
        Empl empl3 = new Empl(1, "Sergei" ,5000);
        Empl empl4 = new Empl(5, "Sveta" ,400);
        Empl empl5 = new Empl(6, "Tolya" ,2000);
        List<Empl> empl = new ArrayList<>();
        empl.add(empl1);
        empl.add(empl2);
        empl.add(empl3);
        empl.add(empl4);
        empl.add(empl5);
        for (Empl e : empl){
            System.out.println(e);
        }



        System.out.println("________________");
        Collections.sort(empl);

        for (Empl e : empl){
            System.out.println(e);
        }
        int index2 = Collections.binarySearch(empl, new Empl(5, "Sveta" ,400));
        System.out.println(index2);

//        int [] array = {-3, 19, 14, 2, -4, 3, 2, 4, 78};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.binarySearch(array, -4));
    }
}
class Empl implements Comparable<Empl> {

    private int id;
    private String name;
    private int salary;

    public Empl(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "empl{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", salary=" + salary +
            '}';
    }

    @Override
    public int compareTo(Empl anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0){
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}


