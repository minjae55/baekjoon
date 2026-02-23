package prefer_array.ex;

import java.util.Scanner;

public class ArrayEx8_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};
        int studentCount = 4;
        double average = 0;

        for (int i = 0; i < studentCount; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요 : ");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + "점수 : ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < studentCount; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            average = (double) total / subjects.length;
            System.out.println((i+1) + "번 학생의 총점 : " + total + ", 평균 : " + average);
        }
    }
}
