package javaAdvance.work_with_files;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExample {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Pavel_Zuyonak\\IdeaProjects\\JavaAlgorithm"
                + "\\test\\src\\main\\java\\javaAdvance\\work_with_files"
                + "\\files\\2.txt");
        File folder = new File("C:\\Users\\Pavel_Zuyonak\\IdeaProjects\\JavaAlgorithm\\FileExample");
        File fakeFolder = new File("C:\\Users\\Pavel_Zuyonak\\IdeaProjects\\JavaAlgorithm\\test\\fakeFolder");
        File fakeFolderFile = new File("C:\\Users\\Pavel_Zuyonak\\IdeaProjects\\JavaAlgorithm\\test\\fakeFolder\\1.txt");

        System.out.println("getAbsoluteFile " + file.getAbsoluteFile());
        System.out.println("getAbsoluteFile " + folder.getAbsoluteFile());
        System.out.println("_________________________________________");

        System.out.println("isAbsolute " + file.isAbsolute());
        System.out.println("isAbsolute " + folder.isAbsolute());
        System.out.println("_________________________________________");

        System.out.println("isDirectory " + file.isDirectory());
        System.out.println("isDirectory " + folder.isDirectory());
        System.out.println("_________________________________________");

        System.out.println("exists " + file.exists());
        System.out.println("exists " + folder.exists());
        System.out.println("_________________________________________");

        System.out.println("exists " + fakeFolder.exists());
        System.out.println("createNewFile " + fakeFolder.mkdir());
        System.out.println("createNewFile " + fakeFolderFile.createNewFile());
        System.out.println("length " + fakeFolderFile.length());
        System.out.println("length " + fakeFolder.length());
        File[] files = fakeFolder.listFiles();
        System.out.println("files " + Arrays.toString(files));
        System.out.println("delete " + fakeFolderFile.delete());
        System.out.println("delete " + fakeFolder.delete());

    }
}
