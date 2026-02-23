package baekjoon;

import java.util.ArrayList;
import java.util.List;

public class Main_1024 {

    public static void main(String[] args) {

        int sum = 18;
        int continuousNum = 2;

        int total = 0;

        List<Integer> list = new ArrayList<>();
        List<Object> sumCheckArr = new ArrayList<>();
        boolean whileRetry = false;

        int count = 0;
        while (true) {

            for (int i = count; i < sum; i++) {
                total += i;
                list.add(i);
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
                List<Integer> inner = (List<Integer>) sumCheckArr.getLast();
                int initSize = inner.size();

                for (int i = 1; i < sumCheckArr.size(); i++) {
                    List<Integer> inner2 = (List<Integer>) sumCheckArr.get(i);
                    if(initSize > inner2.size()) {
                        initSize = inner2.size();
                        inner2.remove(i);
                    }
                    for (Integer integer : inner) {

                        System.out.println("integer = " + integer);
                    }
//                    if(minSize > inner.size()) {
//                        minSize = inn
//                    }
//                    minSize = inner.size();
                }
                System.out.println(sumCheckArr);
                break;
            }
        }
    }
}
