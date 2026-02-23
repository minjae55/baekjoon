package io.start;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamStartMain1 {
 static final String ADDRESS = ("C:\\Users\\user\\IdeaProjects\\java-basic\\java-adv-2\\temp\\hello.dat");

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream(ADDRESS);
        fos.write(65);
        fos.write(66);
        fos.write(67);
        fos.close();
//"C:\\Users\\user\\IdeaProjects\\java-basic\\java-adv-2\\temp\\hello.dat"
        FileInputStream fis = new FileInputStream(ADDRESS);
        int data;
        while ((data = fis.read()) != -1) {
            System.out.println(fis.read());
        }
        fis.close();
    }
}
