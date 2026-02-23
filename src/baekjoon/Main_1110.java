package baekjoon;

import java.util.Scanner;

public class Main_1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 1;

        int firstNum = num / 10;
        int secondNum = num % 10;
        int answer = firstNum + secondNum;

        while((secondNum * 10) + (answer >= 10 ? answer - 10 : answer) != num) {
            firstNum = secondNum;
            secondNum = (answer >= 10 ? answer - 10 : answer);
            answer = firstNum + secondNum;
            count++;
        }
        System.out.println(count);
    }

}
