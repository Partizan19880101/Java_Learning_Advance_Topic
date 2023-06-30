package javaAdvance.work_with_files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {

    public static void main(String[] args) {
        try (
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("C:\\Users\\Pavel_Zuyonak"
                        + "\\IdeaProjects\\JavaAlgorithm\\test\\src\\main\\java"
                        + "\\javaAdvance\\work_with_files\\files\\1.bin"));
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream("C:\\Users\\Pavel_Zuyonak"
                        + "\\IdeaProjects\\JavaAlgorithm\\test\\src\\main\\java"
                        + "\\javaAdvance\\work_with_files\\files\\1.bin"));
        ){
        dataOutputStream.writeBoolean(true);
        dataOutputStream.writeByte(5);
        dataOutputStream.writeShort(120);
        dataOutputStream.writeInt(500);
        dataOutputStream.writeLong(1_000_000L);
        dataOutputStream.writeFloat(3.14F);
        dataOutputStream.writeDouble(123.123);

            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readByte());
            System.out.println(dataInputStream.readShort());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readLong());
            System.out.println(dataInputStream.readFloat());
            System.out.println(dataInputStream.readDouble());


            System.out.println("Done");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
