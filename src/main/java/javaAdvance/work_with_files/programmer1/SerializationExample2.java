package javaAdvance.work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample2 {

    public static void main(String[] args) {
        Car car = new Car("Ford Mondeo", "White");
        Employee employee1 = new Employee("Pavel", "Zuyonak", "QA", 2180, car);

        try (
                ObjectOutputStream outputStream = new ObjectOutputStream(
                        new FileOutputStream("employees2.bin")
                )){
            outputStream.writeObject(employee1);
            System.out.println("Done");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
