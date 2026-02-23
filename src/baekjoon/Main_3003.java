package baekjoon;

import java.util.Scanner;

public class Main_3003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] corrects = {1, 1, 2, 2, 2, 8};
        int[] answers = new int[6];

        for (int i = 0; i < 6; i++) {
            answers[i] = scanner.nextInt();
            System.out.print(corrects[i] - answers[i]+ " ");
            }
        }
    }
