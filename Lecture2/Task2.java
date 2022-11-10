package Lecture2;

import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("C:/Users/Dmitry/Downloads/Postgraduate studies/Homework program/Exception/Lecture2/test.txt");
            fr.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
            System.out.println("finally finished");
        }
    }
}