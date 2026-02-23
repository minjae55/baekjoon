package baekjoon;

import java.util.Scanner;

public class Main_1100 {
    /*
    체스판은 8×8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다.
    가장 왼쪽 위칸 (0,0)은 하얀색이다. 체스판의 상태가 주어졌을 때,
    하얀 칸 위에 말이 몇 개 있는지 출력하는 프로그램을 작성하시오.
    0,0 0,1 0,2 0,3 0,4 0,5 0,6 0,7 0,8  x,0 y짝수일때 흰색
    1,0 1,1 1,2 1,3 1,4 1,5 1,6 1,7 1,8  x,1 y홀
                                         x,2 y짝
                                         x,3 y홀
........
..F.....
.....F..
.....F..
........
........
.......F
.F......      2
입력
첫째 줄부터 8개의 줄에 체스판의 상태가 주어진다. ‘.’은 빈 칸이고, ‘F’는 위에 말이 있는 칸이다.

출력
첫째 줄에 문제의 정답을 출력한다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int black, white = 8;
        int count = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 != 0 ||
                i % 2 != 0 && j % 2 == 0)
                    if (str.equals("F")) {
                        count++;
                    }
            }
        }
        System.out.println(count);
//        x,0 y짝수일때 흰색
//        x,1 y홀
//        x,2 y짝
//        x,3 y홀
    }
}
