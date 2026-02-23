package prefer_array.ex;

public class ArrayEx1 {

    public static void main(String[] args) {

        int students[] = {90, 80, 70, 60, 50};
        int total = 0;
        double average = 0;

        for (int score : students) {
            total += score;
        }
        average = (double) total / 5;

        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + average);
    }
}
