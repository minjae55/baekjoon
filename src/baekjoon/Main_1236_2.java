package baekjoon;

import java.util.Scanner;

public class Main_1236_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        scanner.nextLine();

        String[] guardsPosition = new String[height];

        char x = 'X';
        int rowNeedGuards = 0;
        int colNeedGuards = 0;
        for (int i = 0; i < width; i++) {
            guardsPosition[i] = scanner.nextLine();

        }
    }
}
