package main.file;

import java.io.FileInputStream;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream("C://Users//vadim//OneDrive//Desktop//notes.txt")) {
            System.out.printf("File size: %d bytes \n", fin.available());
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer, 0, fin.available());
            System.out.print("File data: ");
            for (int i = 0; i < buffer.length; i++) {
                System.out.print((char) buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
