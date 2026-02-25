package baekjoon;

import java.util.*;

public class Main_1235 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentQuantity = scanner.nextInt();
        scanner.nextLine();

        String[] studentNums = new String[studentQuantity];
        Set<String> saveStudentNums = new HashSet<>();
        for (int i = 0; i < studentQuantity; i++) {
            String studentNum = scanner.nextLine();
            studentNums[i] = studentNum;
        }

        int numLength = studentNums[0].length();
        int count = 0;

        boolean notOverlap = false;
        for (int i = numLength - 1; i >= 0 ; i--) {
            saveStudentNums.clear();
            count++;
            for (int j = 0; j < studentNums.length; j++) {
                String temporaryValue = studentNums[j].substring(i,numLength);
                if (saveStudentNums.contains(temporaryValue)) {
                    break;
                }
                saveStudentNums.add(temporaryValue);
                if(saveStudentNums.size() == studentQuantity) {
                    notOverlap = true;
                    break;
                }
            }
            if(notOverlap) {
                System.out.println(count);
                break;
            }
        }
    }
}