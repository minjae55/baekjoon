package baekjoon.silver.Main_1268;

import java.util.Scanner;
public class Main_1268_gpt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[N][5];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int answer = 0;

        for (int i = 0; i < N; i++) {

            int cnt = 0;

            for (int j = 0; j < N; j++) {

                if (i == j) continue;

                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        System.out.println(answer + 1);
    }
}