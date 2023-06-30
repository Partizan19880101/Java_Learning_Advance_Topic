package javaAdvance.work_with_files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Pavel_Zuyonak\\IdeaProjects\\JavaAlgorithm"
                + "\\test\\src\\main\\java\\javaAdvance\\work_with_files"
                + "\\files\\1.png");
                FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Pavel_Zuyonak\\IdeaProjects\\JavaAlgorithm"
                        + "\\test\\src\\main\\java\\javaAdvance\\work_with_files"
                        + "\\files\\2.png");
        ){

            int i;
            while ((i = fileInputStream.read())!=-1) {
                fileOutputStream.write(i);
            }

            System.out.println("Done");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
