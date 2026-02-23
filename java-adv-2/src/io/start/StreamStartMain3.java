package io.start;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain3 {
    static final String ADDRESS = ("C:\\Users\\user\\IdeaProjects\\java-basic\\java-adv-2\\temp\\hello.dat");

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream(ADDRESS);
        byte[] input = {65, 66, 67};
        fos.write(input);
        fos.close();

        FileInputStream fis = new FileInputStream(ADDRESS);
        byte[] buffer = new byte[10];
        int readCount = fis.read(buffer, 0, 10);
        System.out.println("readCount = " + readCount);
        System.out.println(Arrays.toString(buffer));
        fis.close();
    }
}
