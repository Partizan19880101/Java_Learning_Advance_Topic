package javaAdvance.work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferExample2 {

    public static void main(String[] args) {
        try (RandomAccessFile file =
                new RandomAccessFile("src\\main\\java\\javaAdvance\\work_with_files\\files\\text5.txt", "r");
                FileChannel channel = file.getChannel();
        ){
            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.rewind();
            System.out.println((char)buffer.get()); //a
            System.out.println("____________________");
            buffer.compact();
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.println((char)buffer.get());
            }
            System.out.println("____________________");
            buffer.clear();
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            buffer.mark();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.reset();
            while (buffer.hasRemaining()) {
                System.out.println((char)buffer.get());
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
