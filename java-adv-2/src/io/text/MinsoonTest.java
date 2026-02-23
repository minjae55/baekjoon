package io.text;

import java.io.*;

public class MinsoonTest {

    private static String FILE_NAME = "C:\\Users\\user\\IdeaProjects\\java-basic\\java-adv-2\\temp\\hello.dat";

    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream(FILE_NAME);

        byte[] buffer = new byte[8 * 1024]; //8KB 버퍼 생성
        int bytesRead;

        while ((bytesRead = is.read(buffer)) != -1) {
            System.out.println((char)bytesRead);
            for (int i = 0; i < bytesRead; i++) {

            }
        }
    }
}
