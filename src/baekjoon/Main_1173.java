package baekjoon;

import java.util.Scanner;

public class Main_1173 {

    static int count = 0;

    public static void main(String[] args) {

        playExercise();

    }

    static void playExercise() {
        Scanner scanner = new Scanner(System.in);
        int goalTime = scanner.nextInt(); //N : 운동 시간
        int initCriteria = scanner.nextInt(); //m : 초기 맥박, 최소 기준
        int minCriteria = initCriteria;
        int maxCriteria = scanner.nextInt(); //M : 최대 기준
        int increasePulse = scanner.nextInt(); // T : 증가
        int reductionPulse = scanner.nextInt(); // R : 감소
        int time = 0;

        //1 60 70 11 11
        //3 45 60 25 25

        while (goalTime != time) {
                if ((initCriteria + increasePulse) <= maxCriteria) {
                    initCriteria += increasePulse;
                    time++;
                    count++;
                } else {
                    initCriteria = rest(initCriteria, reductionPulse);
                    if (initCriteria < minCriteria) {
                        initCriteria = minCriteria;
                    }
                }
        }
        System.out.println(count);
    }

    static int rest(int initCriteria, int reductionPulse) {
        count++;
        return (initCriteria -= reductionPulse);
    }

}
