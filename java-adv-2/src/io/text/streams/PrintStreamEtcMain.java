package io.text.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEtcMain {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\java-basic\\java-adv-2\\temp\\print.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        PrintStream printStream = new PrintStream(fos);
        printStream.println("hello java!");
        printStream.println(10);
        printStream.println(true);
        printStream.printf("hello %s", "world");
        printStream.close();
    }
}
