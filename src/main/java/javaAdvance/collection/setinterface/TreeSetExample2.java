package javaAdvance.collection.setinterface;


import java.util.Objects;
import java.util.TreeSet;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

public class TreeSetExample2 {

    public static void main(String[] args) {
        TreeSet<Cat> cats = new TreeSet<>();
        Cat Barsik = new Cat("Barsik", 3, 4);
        Cat Borzik = new Cat("Borzik", 2, 3);
        Cat Masya = new Cat("Masya", 4, 4);
        Cat Ury = new Cat("Ury", 5, 4);
        Cat Iana = new Cat("Iana", 5, 4);

        cats.add(Barsik);
        cats.add(Borzik);
        cats.add(Masya);
        for (Cat c : cats) {
            System.out.println(c);
        }
        System.out.println(cats.first());
        System.out.println(cats.last());
        System.out.println(cats.headSet(Ury));
        System.out.println(cats.subSet(Borzik, Ury)); //Between 2 parameters
        System.out.println(Iana.equals(Ury));
        System.out.println(Iana.hashCode() == Ury.hashCode());
    }
}

@ToString
@Data
@AllArgsConstructor
class Cat implements Comparable<Cat>{

    String name;
    int age;
    int paws;

    @Override
    public int compareTo(Cat o) {
        return this.age - o.getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cat cat = (Cat) o;
        return age == cat.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}