package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main_1024_2 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        InputStream is = new BufferedInputStream((System.in));

        long sum =  Long.parseLong(br.readLine());
        long continuousNum =  Long.parseLong(br.readLine());


        long total = 0;

        List<Long> list = new ArrayList<>();
        List<Object> sumCheckArr = new ArrayList<>();
        boolean whileRetry = false;

        long count = 0;
        while (true) {

            for (long i = count; i < sum; i++) {
                total += i;
                list.add(i);
//                if (count >= sum) {
//                    sumCheckArr.add(-1);
//                }
                if (total > sum) {
                    list.clear();
                    total = 0;
                    count++;
                    whileRetry = true;
                    break;
                } else if (total == sum && list.size() >= continuousNum) {
                    sumCheckArr.add(new ArrayList<>(list));
                }
            }
            if (whileRetry) {
                whileRetry = false;
                continue;
            } else {
                System.out.println(sumCheckArr.getLast());
                    break;
            }
        }
    }
}
