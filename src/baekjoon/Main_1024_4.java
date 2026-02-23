package baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_1024_4 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        long criteriaNum = scanner.nextLong();
        long numLength = scanner.nextLong();

        List<Long> setNumbers = new ArrayList<>();
        long result = 0;
        long bestStart = -1;
        long bestLength = 0;

        for (long i = 0; i <= (criteriaNum / 2) ; i++) {
            for (long j = (i + 1); j <= (criteriaNum / 2); j++) {
                result += j;
                setNumbers.add(j);
                System.out.println(setNumbers);

                if (result == criteriaNum && setNumbers.size() >= numLength) {
                    bestStart = setNumbers.getFirst();
                    bestLength = setNumbers.size();
                    continue;
                } else if (result > criteriaNum) {
                    setNumbers.clear();
                    result = 0;
                    break;
                }
            }
        }

        if (!setNumbers.isEmpty()) {
            for (long i = bestStart; i < bestStart + bestLength; i++) {
                System.out.print(i + " ");
            }
        }
    }
}