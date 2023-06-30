package javaAdvance.collection.queue;

import java.util.Objects;
import java.util.PriorityQueue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

public class PriorityQueueExample2 {

    public static void main(String[] args) {
        Cat2 Barsik = new Cat2("Barsik", 3, 4);
        Cat2 Borzik = new Cat2("Borzik", 2, 3);
        Cat2 Masya = new Cat2("Masya", 4, 4);
        Cat2 Ury = new Cat2("Ury", 5, 4);
        Cat2 Iana = new Cat2("Iana", 5, 4);

        PriorityQueue<Cat2> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(Barsik);
        priorityQueue.add(Borzik);
        priorityQueue.add(Masya);
        priorityQueue.add(Ury);
        priorityQueue.add(Iana);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
    }

}
@ToString
@Data
@AllArgsConstructor
class Cat2 implements Comparable<Cat2> {

    String name;
    int age;
    int paws;


    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public int compareTo(Cat2 o) {
        return this.age - o.getAge();
    }
}