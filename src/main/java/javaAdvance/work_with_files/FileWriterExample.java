package javaAdvance.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) throws IOException {
        String text = "The deal for the 29-year-old is also worth a \n"
                + "possible £5m in add-ons and he has signed a four-year contract.\n"
                + "Kovacic is City's first signing of the summer after they won the \n"
                + "Treble of Champions League, Premier League and FA Cup titles last season.";
        String s = "\nHello mondly";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C:\\Users\\Pavel_Zuyonak\\IdeaProjects\\JavaAlgorithm"
                                                + "\\test\\src\\main\\java\\javaAdvance\\work_with_files"
                                                + "\\files\\2.txt", true);
//            for (int i = 0; i < text.length(); i++) {
//                fileWriter.write(text.charAt(i));
//            }
//            fileWriter.write(text);
            fileWriter.write(s);
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileWriter.close();
        }
    }
}
