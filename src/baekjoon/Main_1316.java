package baekjoon;

import java.util.Scanner;

public class Main_1316 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int wordCapacity = input.nextInt();
        input.next();
        int count = wordCapacity;
        String[] wordGroup = new String[wordCapacity];

        for (int i = 0; i < wordCapacity; i++) {
            wordGroup[i] = input.nextLine();
        }

        //happy
        //hap
        for (int i = 0; i < wordGroup.length; i++) {
            char[] charWords = wordGroup[i].toCharArray();
            for (int j = 0; j < charWords.length - 2; j++) {
                if (charWords[j] == charWords[j + 2]) {
                    count--;
                }
            }
        }
        System.out.println(count < 0 ? 0 : count);
    }
}
