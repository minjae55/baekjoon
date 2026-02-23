package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
상근이가 선수 다섯 명을 선발할 수 없는 경우에는 "PREDAJA" (따옴표 없이)를 출력한다. PREDAJA는 크로아티아어로 항복을 의미한다.
선발할 수 있는 경우에는 가능한 성의 첫 글자를 사전순으로 공백없이 모두 출력한다.

 */
public class Main_1159 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[capacity];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }
        
        char[] chars = new char[capacity];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = arr[i].charAt(0);
        }

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < chars.length ; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] ) {
                    list.add(chars[i]);
                }
            }
        }
        System.out.println(list);



        char[] alphabets = new char[26];
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = (char)(97 + i);
        }



    }
}
