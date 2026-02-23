package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_1158 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int capacity = input.nextInt();
        int deletePeople = input.nextInt();

        int[] peoples = new int[capacity];

        for (int i = 0; i < peoples.length; i++) {
            peoples[i] = i + 1;
        }

        deletePeople(peoples, deletePeople);
    }

    static private void deletePeople(int[] peoples, int deletePeople) {
        List<Integer> deadPeoples = new ArrayList<>();
        int deadCount = deletePeople;
        //<3, 6, 2, 7, 5, 1, 4>   7, 3

        while (deadPeoples.size() != peoples.length) {
            //1 ,2 , 3, 4, 5, 6, 7
            //       0        0
            if(deadCount % deletePeople == 0 && !deadPeoples.contains(deadCount)) {
                deadPeoples.add(deadCount);
                peoples[deadCount] = 0;
                System.out.println("deadPeoples = " + deadPeoples);
            }
            deadCount++;
            if (deadCount >= peoples.length) {
                deadCount -= peoples.length;
            }

        }
        for (Integer deadPeople : deadPeoples) {
            System.out.println(deadPeople + " ");
        }
    }
}

