    package baekjoon;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class Main_1225 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String firstNum = scanner.next();
            String secondNum = scanner.next();

            char[] firstNumChar = firstNum.toCharArray();
            char[] secondNumChar = secondNum.toCharArray();

            List<Integer> firstNumbers = new ArrayList<>();
            List<Integer> secondNumbers = new ArrayList<>();

            for (char c : firstNumChar) {
                firstNumbers.add((int) c - 48);
            }
            for (char c : secondNumChar) {
                    secondNumbers.add((int) c - 48);
            }
            Long result = 0L;
            for (Integer firstNumber : firstNumbers) {
                for (Integer secondNumber : secondNumbers) {
                    result += (firstNumber * secondNumber);
                }
            }
            System.out.println(result);
        }
    }
