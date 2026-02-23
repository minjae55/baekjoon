package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_1292 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int startNum = scanner.nextInt();
        int endNum = scanner.nextInt();

        for (int i = 1; i <= 1000; i++) {
            for (int j = i; j < (i * 2); j++) {
                list.add(i);
            }
        }
        int result = 0;
        for (int i = startNum; i <= endNum; i++) {
            result += list.get(i - 1);
        }
        System.out.println(result);
    }
}
