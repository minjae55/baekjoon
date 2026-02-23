package static2.ex;

import org.jetbrains.annotations.NotNull;

public class MathArrayUtils {

    private MathArrayUtils() {
        //private 인스턴스 생성을 막음.
    }
//    private static int totalSum;
//    private static double average;
//    private static int minNum;
//    private static int maxNum;

    public static int sum(int @NotNull [] arrays) {
        int totalSum = 0;
        for (int i = 0; i < arrays.length; i++) {
            totalSum += arrays[i];
        }
        return totalSum;
    }

    public static double average(int[] arrays) {
        return (double) sum(arrays) / arrays.length;
    }

    public static int min(int[]arrays) {
        int minNum = arrays[0];
        for (int array : arrays) {
            if (minNum > array) {
                minNum = array;
            }
        }
        return minNum;
    }

    public static int max(int[]arrays) {
        int maxNum = arrays[0];
        for (int array : arrays) {
            if (maxNum < array) {
                maxNum = array;
            }
        }
        return maxNum;
    }

}
