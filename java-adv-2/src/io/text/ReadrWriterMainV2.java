package io.text;

import java.io.*;

import static io.text.TextConst.*;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ReadrWriterMainV2 {
    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        System.out.println("wirte Stirng : " + writeString);

        //파일에 쓰기
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        OutputStreamWriter osw = new OutputStreamWriter(fos, UTF_8);//Writer는 문자

        osw.write(writeString);
        osw.close();

        //파일에서 읽기
        FileInputStream fis = new FileInputStream(FILE_NAME);
        InputStreamReader isr = new InputStreamReader(fis, UTF_8);


        StringBuilder content = new StringBuilder();
        int ch;
        //char을 반환함
        while ((ch = isr.read()) != -1) {
            content.append((char)ch);
        }
        isr.close();

        System.out.println("read String : " + content);
    }
}
