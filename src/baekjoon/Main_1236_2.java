package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1236_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        scanner.nextLine();
        String[] temporaryGuardsPosition = new String[rows];
        Character[][] guardsPosition = new Character[rows][columns];

        for (int i = 0; i < rows; i++) {
            temporaryGuardsPosition[i] = scanner.nextLine();
            for (int j = 0; j < columns; j++) {
                guardsPosition[i][j] = temporaryGuardsPosition[i].charAt(j);
            }
        }

        for (int i = 0; i < rows; i++) {
        }




    }
}
