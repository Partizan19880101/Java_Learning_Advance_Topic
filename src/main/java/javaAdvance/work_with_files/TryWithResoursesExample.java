package javaAdvance.work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResoursesExample {

    public static void main(String[] args) throws IOException {

        try(FileReader fileReader = new FileReader("C:\\Users\\Pavel_Zuyonak\\IdeaProjects\\JavaAlgorithm"
                + "\\test\\src\\main\\java\\javaAdvance\\work_with_files"
                + "\\files\\2.txt"); FileWriter fileWriter = new FileWriter("C:\\Users\\Pavel_Zuyonak\\IdeaProjects\\JavaAlgorithm"
                + "\\test\\src\\main\\java\\javaAdvance\\work_with_files"
                + "\\files\\2.txt", true)) {

            int character;
            while ((character = fileReader.read())!= -1) {
                System.out.print((char) character);
            }
            System.out.println("Done");
        }
    }
}
