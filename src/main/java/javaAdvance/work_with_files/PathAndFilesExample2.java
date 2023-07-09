package javaAdvance.work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesExample2 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("text15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Pavel_Zuyonak\\Desktop\\M");
        Path directoryBPath = Paths.get("C:\\Users\\Pavel_Zuyonak\\Desktop\\B");

        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
        Files.copy(filePath, directoryPath.resolve("text16.txt"));
        Files.copy(directoryBPath, directoryPath.resolve("B"));
        System.out.println("Done");

        Files.move(filePath, directoryPath.resolve("text15.txt"));
        Files.move(Paths.get("text10.txt"), Paths.get("text12.txt"));
        Files.delete(Paths.get("text100.txt"));
        Files.delete(directoryPath);
    }
}
