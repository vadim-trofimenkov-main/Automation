package main.trofimenkov.javapart.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String text = "Hello world";
        try (FileOutputStream fos = new FileOutputStream("C://Users//vadim//OneDrive//Desktop//notes.txt")) {
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("The file has been written");
    }
}
