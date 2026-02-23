package baekjoon;

import java.util.Scanner;

public class Main_1157 {
    public static void main(String[] args) {
        Scanner inputWord = new Scanner(System.in);
        String word = inputWord.nextLine();

        int[] alphabets = new int[26];
        for (int i = 0; i < word.length(); i++) {
            int inputNum = (int) (word.toLowerCase().charAt(i)) - 97;
            alphabets[inputNum]++;
        }

        int maxNum = 0;
        for (int i = 0; i < alphabets.length; i++) {
            if (maxNum < alphabets[i]) {
                maxNum = alphabets[i];
            }
        }

        int count = 0;
        int temporary = 0;

        for (int i = 0; i < alphabets.length; i++) {
            if (maxNum == alphabets[i]) {
                temporary = i;
                count++;
            }
        }
        System.out.println((count > 1) ? "?" :(char)(temporary + 97));

    }
}
