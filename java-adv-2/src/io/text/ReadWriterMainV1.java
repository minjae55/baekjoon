package io.text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import static io.text.TextConst.*;
import static java.nio.charset.StandardCharsets.*;

public class ReadWriterMainV1 {

    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        //문자 byte UTF - 8 인코딩
        byte[] writeBytes = writeString.getBytes(UTF_8);
        System.out.println("writeString = " + writeString);
        System.out.println("writeBytes = " + Arrays.toString(writeBytes));

        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        fos.write(writeBytes);
        fos.close();

        // 파일에서 읽기
        FileInputStream fis = new FileInputStream(FILE_NAME);
        byte[] readBytes = fis.readAllBytes();
        fis.close();

        //byte -> STring UTF-8 디코딩
        String readString = new String(readBytes, UTF_8);
        System.out.println("Arrays.toString(readBytes) = " + Arrays.toString(readBytes));
        System.out.println("readString = " + readString);
    }
}
