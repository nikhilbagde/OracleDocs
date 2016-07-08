package Collections.Maps;

import java.util.*;

/**
 * Created by Nikhil on 7/7/2016.
 */
public class Problem1 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> LinkedMap = new LinkedHashMap<>();
        Map<String, String> treeMap = new TreeMap<>();
        testMap(treeMap);

    }
    public static void testMap(Map<String, String> map){
        map.put("C", "CCCCC");
        map.put("B", "BBBBB");
        map.put("A", "AAAAA");
        map.put("b", "bbbbb");
        map.put("c", "ccccc");
        map.put("a", "aaaaa");
        map.put("9", "Nine");
        map.put("0", "zero");
        map.put("5", "Five");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            Set<String> key = map.keySet();
            Collection<String> value = map.values();

            String key1 = entry.getKey();
            String value1 = entry.getValue();
            //System.out.println(entry.getKey());
            System.out.println(entry.getKey() + " " +  entry.getValue() + " " );
        }

    }
}
