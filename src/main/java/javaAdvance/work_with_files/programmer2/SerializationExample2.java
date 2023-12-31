package javaAdvance.work_with_files.programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javaAdvance.work_with_files.programmer1.Employee;

public class SerializationExample2 {

    public static void main(String[] args) {
        Employee bestEmployee;

        try (
                ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("employees2.bin")
        )){
            bestEmployee = (Employee)inputStream.readObject();
            System.out.println(bestEmployee);

    } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
