package io.text;

import java.io.*;

public class MinsoonTest2 {

    private static String FILE_NAME = "C:\\Users\\user\\IdeaProjects\\java-basic\\java-adv-2\\temp\\hello.dat";

    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream(FILE_NAME);

        byte[] allBytes =  is.readAllBytes();
        System.out.println(new String(allBytes));
    }
}
