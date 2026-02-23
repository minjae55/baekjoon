package baekjoon;

import java.util.Scanner;

public class Main_1236 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        scanner.nextLine();

        String[] guardDeployemt = new String[height];
        int needGuard = 0;
        boolean haveGuard = false;

        char x = 'X';
        for (int i = 0; i < width; i++) {
            guardDeployemt[i] = scanner.nextLine();
            haveGuard = false;
            for (Character c : guardDeployemt[i].toCharArray()) {
                if(c == x) {
                    haveGuard = true;
                }
            }
            if(!haveGuard) {
                needGuard++;
            }
        }
        System.out.println(needGuard);
    }
}
