package baekjoon;

import java.util.Scanner;

public class Main_1075 {
    public static void main(String[] args) {

        Scanner intputNumber = new Scanner(System.in);

        long number = intputNumber.nextLong();
        long duplicationNumber = number;
        int divisionNum = intputNumber.nextInt();
        long maxNum = number / 100;
        long duplicationMaxNum = maxNum;

        long compareNum1 = 0;
        for (int i = 0; i <= 100; i++) {
                number++;
                if (number / 100 > maxNum) break;
             if (number % divisionNum == 0) {
                System.out.println("number = " + number);
                compareNum1 = number % 10;
                System.out.println("compareNum1 = " + compareNum1);
                break;
            }
        }

        long compareNum2 = 0;

        for (int i = 0; i <= 100; i++) {
            duplicationNumber--;
            if (duplicationNumber / 100 < duplicationMaxNum) break;
            if (duplicationNumber % divisionNum == 0) {
                System.out.println("duplicationNumber = " + duplicationNumber);
                compareNum2 = duplicationNumber % 10;
                System.out.println("compareNum2 = " + compareNum2);

            }
        }
        System.out.println((compareNum1 > compareNum2 ? compareNum2 : compareNum1));
    }
}
