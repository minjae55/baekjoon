package baekjoon;

import java.util.*;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Collections;

    /*
      양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다.
      어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.

      2
      (1) 2 4 (8)   8
      (1),2,(4) 4
      (1),2,5,(10) 10
      (1),2,4,8,(16) 16
      (1) 2 4 5 10 (20) 20
      (1) 2 3 5 6 10 15 (30)
      //8으

1*1 1
2 2 4 1 2 4
3 3 9 1 3 9
4 4 16 1 2 4 8 16
5 5
6 6 36
7 7 59
      c = 4             6                2
      n = 10            12              14            15            16          18              20
      a = 1,2,5,10      1,2,3,4,6,12    1,2,7,14     1,3,5,15   1,2,4,8,16      1,2,3,6,9,18   1,2,4,5,10,20
                                                                   2,4          3,4             3,4
      n =   21          22              24                          25       27             28
      a =  1,3,7,21     1,2,11,22       1,2,4,6,8,12,24         1,5,25      1,3,9,27    1,2,4,7,14,28
                                            3,4
      n =   30                      32                  34          36              38          40
      a =  1,2,3,5,6,10,15,30       1,2,4,8,16,32       1,2,17,34   1,2,6,18,36     1,2,19,38   1,2,4,5,8,20,40
     */
    public class Main_1037 {
    public static void main(String[] args) {
        //조건은 약수가 1과 본인이 아니여야 함.
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = inputNumbers(scanner);  //번호 입력 받음
        calculateDivisor(numbers);
        List<Integer> divisors = new ArrayList<>();

    }

    private static void calculateDivisor(List<Integer> numbers) {
        Collections.sort(numbers);
        int result = 0;
        for (Integer number : numbers) {
            if (numbers.size() != 1) {
               result =  numbers.get(0) * numbers.get(numbers.size() - 1);
//               result =  numbers.getFirst() * numbers.getLast();
            } else if (numbers.size() == 1) {
                result = numbers.get(0) * numbers.get(0);
//                result = numbers.getFirst() * numbers.getFirst();
            }
        }
        System.out.println(result);

        }

    private static List<Integer> inputNumbers(Scanner scanner) {
        int count = scanner.nextInt();
        List<Integer> lists = new ArrayList<>();

        while (lists.size() < count) {
          lists.add(scanner.nextInt());
        }
        return lists;
    }
}


