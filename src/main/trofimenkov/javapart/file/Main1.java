package main.trofimenkov.javapart.file;

import java.io.FileInputStream;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream("C://Users//vadim//OneDrive//Desktop//notes.txt")) {
            System.out.printf("File size: %d bytes \n", fin.available());
            int i;
            while((i = fin.read())!= -1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
