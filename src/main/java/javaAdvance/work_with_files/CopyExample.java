package javaAdvance.work_with_files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyExample {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Pavel_Zuyonak\\IdeaProjects\\JavaAlgorithm"
                + "\\test\\src\\main\\java\\javaAdvance\\work_with_files"
                + "\\files\\2.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Pavel_Zuyonak\\IdeaProjects\\JavaAlgorithm"
                        + "\\test\\src\\main\\java\\javaAdvance\\work_with_files"
                        + "\\files\\3.txt"));
        ){
//            int character;
//            while ((character = reader.read())!=-1) {
//                writer.write(character);
//            }
            String line;
            while ((line = reader.readLine())!=null) {
                writer.write(line);
                writer.write('\n');
            }

            System.out.println("Done");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
