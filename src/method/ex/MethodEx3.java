package method.ex;

import java.util.Scanner;

public class MethodEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int selectNumber = 0;
        int depositAmount, withdrawAmount;
        int totalAmount = 0;

        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("1. 입금 ㅣ 2.출금 ㅣ 3. 잔액 확인 ㅣ 4. 종료");
            System.out.println("-----------------------------------------");
            selectNumber = scanner.nextInt();

            switch (selectNumber) {
                case 1:
                    System.out.print("입금액을 입력하세요 : ");
                    depositAmount = scanner.nextInt();
                    totalAmount = deposit(depositAmount,totalAmount);
                    scanner.nextLine();

                    System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액 : " + totalAmount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요 : ");
                    withdrawAmount = scanner.nextInt();
                    if (withdrawAmount <= totalAmount) {

                        totalAmount = withdraw(withdrawAmount, totalAmount);
                        scanner.nextLine();

                        System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액 : " + totalAmount);
                    } else {
                        System.out.println(withdrawAmount + "원을 출금하려 했으나, 잔액이 부족합니다.");
                    }
                    break;
                case 3:
                    System.out.println("현재 잔액 : " + totalAmount);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;

            }
        }
    }
    public static int deposit(int depositAmount, int totalAmount) {
        totalAmount += depositAmount;
        return totalAmount;
    }

    public static int withdraw(int withdrawAmount, int totalAmount) {
        totalAmount -= withdrawAmount;
        return totalAmount;
    }
}
