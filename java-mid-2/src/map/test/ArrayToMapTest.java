package map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] proudctArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        HashMap<String, Integer> map = new HashMap<>();
        for (String[] strings : proudctArr) {
            map.put(strings[0], Integer.valueOf(strings[1]));
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println("제품 : " + stringIntegerEntry.getKey() + ", 가격 : " + stringIntegerEntry.getValue());
        }
    }
}
