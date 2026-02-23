package baekjoon;

import java.util.*;

public class Main_1026 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int capacity =scanner.nextInt();
        scanner.nextLine();

        List<Integer> arrA = new ArrayList<>();
        List<Integer> arrB = new ArrayList<>();

        for (int i = 0; i < capacity; i++) {
            int number = scanner.nextInt();
            arrA.add(number);
        }

        for (int i = 0; i < capacity; i++) {
            int number = scanner.nextInt();
            arrB.add(number);
        }

        for (int i = 0; i < arrB.size(); i++) {
            int minNum = Collections.min(arrB);
            int indexNum = arrB.indexOf(minNum);
            System.out.println("i번쩆 =" + minNum + "," + indexNum);
        }

        Collections.sort(arrA, (i1, i2) -> i1 - i2);
        //순서대로 정렬 arrB
        for (Integer i : arrA) {

        }
        /*


        B의 가장
        arrA
        arrB

         */





    }
}
