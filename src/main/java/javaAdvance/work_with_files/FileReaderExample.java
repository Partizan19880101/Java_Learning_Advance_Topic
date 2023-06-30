package javaAdvance.work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("C:\\Users\\Pavel_Zuyonak\\IdeaProjects\\JavaAlgorithm"
                    + "\\test\\src\\main\\java\\javaAdvance\\work_with_files"
                    + "\\files\\2.txt");
            int character;
            while ((character = fileReader.read())!= -1) {
                System.out.print((char) character);
            }
            System.out.println("Done");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            fileReader.close();
        }
    }
}
