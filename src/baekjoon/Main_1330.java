package baekjoon;

import java.util.Scanner;

public class Main_1330 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[2];

        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }

        if (number[0] > number[1]) {
            System.out.println(">");
        } else if (number[0] < number[1])
            System.out.println("<");
        else {
            System.out.println("==");
        }
    }
}
