package de.ait.lessons.javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class ByteStreamWritter {
    public static void main(String[] args) {
        String textToWrite = "Hello";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("output.bin")
            byte[] bytes = textToWrite.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(bytes);
            System.out.println("File written successfully");

        }
        catch (FileNotFoundException exception) {
            System.out.println("File not Found");
            exception.printStackTrace();
    }
}
