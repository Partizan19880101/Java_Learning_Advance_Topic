package javaAdvance.work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample1 {

    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Pavel");
        employees.add("Darya");
        employees.add("Olga");
        employees.add("Nadia");
        employees.add("Lera");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees1.bin")
        )
                ){
            outputStream.writeObject(employees);
            System.out.println("Done");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
