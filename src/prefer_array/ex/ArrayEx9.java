package prefer_array.ex;

import java.util.Scanner;

public class ArrayEx9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productCount = 0;
        int maxCount = 10;
        int selectNumber;
        String[] productNames = new String[3];
        int[] productPrices = new int[3];

        System.out.println("1. 상품 등록 ㅣ 2. 상품 목록 ㅣ 3. 종료");
        System.out.println("메뉴를 선택하세요 : ");
        selectNumber = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < maxCount; i++) {
            if (selectNumber == 1) {
                System.out.print("상품 이름을 입력하세요 : ");
                productNames[i] = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요 : ");
                productPrices[i] = scanner.nextInt();
            }
        }
    }
}
