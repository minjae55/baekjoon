package baekjoon;

import java.util.*;

public class Main_1302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saleQuantity = scanner.nextInt();
        scanner.nextLine();
        List<String> bookList = new ArrayList<>();
        int[] bookIndex = new int[saleQuantity];


        for (int i = 0; i < saleQuantity; i++) {
            String book = scanner.nextLine();
            if (bookList.contains(book)) {
                bookIndex[bookList.indexOf(book)]++;
            } else {
                bookList.add(book);
            }
        }

        int maxCount = bookIndex[0];
        int bookIndexNum = 0;
        for (int i = 0; i < bookIndex.length; i++) {
            if (i == 0) continue;
            if(maxCount < bookIndex[i]) {
                maxCount = bookIndex[i];
                bookIndexNum = i;
            } else if(maxCount == bookIndex[i]) {
                int checkNumber = bookList.get(bookIndexNum).compareTo(bookList.get(i));
                if(checkNumber > 0) {
                    maxCount = bookIndex[i];
                    bookIndexNum = i;
                }
            }
        }
        System.out.println(bookList.get(bookIndexNum));
    }
}
