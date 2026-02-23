package map.test;

import java.util.HashMap;
import java.util.Map;

public class ItemPriceTest {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        HashMap<String, Integer> result = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1000) {
                result.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println(result.keySet());
    }
}
