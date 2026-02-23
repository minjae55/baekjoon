package baekjoon;

import java.util.Scanner;

public class Main_2444 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rule = 0;

        for (int i = 0 ; i < 5; i++) {
            rule = 2 * i - 1;

            for (int j = 0; j < rule; j++) {
                System.out.print("*");
            }
        }
    }
}