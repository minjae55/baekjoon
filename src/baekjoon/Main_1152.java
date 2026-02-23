package baekjoon;

import java.io.*;

public class Main_1152 {
    public static void main(String[] args) throws IOException {
        Reader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = ((BufferedReader) reader).readLine();

        String[] split = line.split(" ");
        int count = 0;

        for (String s : split) {
            if (!s.equals("")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
