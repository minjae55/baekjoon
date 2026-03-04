//package baekjoon.backtracking.main_16198;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.StringTokenizer;
//
//public class Main_16198 {
//
//    static int result = 0;
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        //키보드 입력을 한 줄 단위로 빠르게 읽음
//        List<Integer> arr = new ArrayList<>();
//
//        int q = Integer.parseInt(br.readLine()); // 갯수
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        for (int i = 0; i < q; i++) {
//            arr.add(Integer.parseInt(st.nextToken()));
//        }
//
//        System.out.println(test(arr));
//    }
//
//
//
//    private static int test(List<Integer> arr) {
//        int maxValue = Integer.MIN_VALUE;
//        int maxIndex = 0;
//        int result = 0; //에너지 합
//
//        while(arr.size() > 3) {
//            for (int i = 0; i < arr.size(); i++) { //최대값 구하기
//                if(maxValue < i) {
//                    maxValue = arr.get(i);
//                    maxIndex = i;
//                }
//            }
//            calculate(arr, maxIndex);
//        }
//        return result;
//    }
//
//    private static void calculate(List<Integer> arr, int maxIndex) {
//        checkIndex(arr, maxIndex);
//    }
//
//    private static void leftCalculate(List<Integer> arr, int maxIndex, int l) {
//        if
//        result = (arr.get(maxIndex) * arr.get(maxIndex - l));
//        arr.remove(maxIndex - l);
//    }
//
//    private static void rightCalculate(List<Integer> arr, int maxIndex, int r) {
//        result = (arr.get(maxIndex) * arr.get(maxIndex - r));
//        arr.remove(maxIndex - r);
//    }
//
//
//    private static int checkIndex(List<Integer> arr, int maxIndex) {
//        int l = maxIndex;
//        int r = maxIndex;
//
//        for (int i = 0; i < 2; i++) {
//            l--;
//            r++;
//            if(l <= 0) {
//                return l;
//            } else if (r > arr.size() + 1) {
//                return r;
//            }
//        }
//
//        return (arr.get(l) > arr.get(r) ? l + 1 : r - 1);
//
//    }
//
//
//}
