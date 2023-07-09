package javaAdvance.work_with_files;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Format;
import java.util.Map;

public class PathAndFilesExample1 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("text15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Pavel_Zuyonak\\Desktop\\M");

        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("directoryPath.getFileName() " + directoryPath.getFileName());
        System.out.println("_______________________________________");

        System.out.println("filePath.getParent() " + filePath.getParent());
        System.out.println("directoryPath.getParent() " + directoryPath.getParent());
        System.out.println("_______________________________________");

        System.out.println("filePath.getRoot() " + filePath.getRoot());
        System.out.println("directoryPath.getRoot() " + directoryPath.getRoot());
        System.out.println("_______________________________________");

        System.out.println("filePath.toAbsolutePath() " + filePath.toAbsolutePath());
        System.out.println("directoryPath.toAbsolutePath() " + directoryPath.toAbsolutePath());
        System.out.println("_______________________________________");

        System.out.println("filePath.toAbsolutePath() " + filePath.toAbsolutePath());
        System.out.println("directoryPath.toAbsolutePath() " + directoryPath.toAbsolutePath());
        System.out.println("_______________________________________");
        Path anotherPath = Paths.get("C:\\Users\\Pavel_Zuyonak\\Desktop\\M\\N\\K\\test20.txt");
        System.out.println("directoryPath.toAbsolutePath() " + directoryPath.relativize(anotherPath));

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if (!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }
        System.out.println("Files.isReadable(filePath) " + Files.isReadable(filePath));
        System.out.println("Files.isWritable(filePath) " + Files.isWritable(filePath));
        System.out.println("Files.isExecutable(filePath) " + Files.isExecutable(filePath));
        System.out.println("Files.isExecutable(filePath) " + Files.size(filePath));
        System.out.println("Files.isExecutable(filePath) " + Files.getAttribute(filePath, "creationTime"));
        Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        for (Map.Entry<String, Object> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
