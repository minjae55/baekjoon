package baekjoon;

import java.util.Scanner;

public class Main_10950 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[2];
        int result = 0;

        for (int i = 0 ; i < 2; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers.length == 1) {
                scanner.nextLine();
            } else if (numbers.length >= 2) {
                result = sum(numbers[0], numbers[1]);
            }
        }
            System.out.println(result);
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
