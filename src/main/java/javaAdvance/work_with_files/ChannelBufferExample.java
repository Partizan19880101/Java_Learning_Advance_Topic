package javaAdvance.work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferExample {

    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("text10.txt", "rw");
                FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder builder = new StringBuilder();

            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("Read " + byteRead);

                buffer.flip();
                while (buffer.hasRemaining()) {
                    builder.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(builder);

            String text = "\nFor the first time in its history, Wimbledon has relaxed its dress code rules. "
                    + "Why are they so strict? Ellie Violet Bramley takes a look.";

            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);

//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer2.put(text.getBytes());
//            buffer2.flip();
//            channel.write(buffer2);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
