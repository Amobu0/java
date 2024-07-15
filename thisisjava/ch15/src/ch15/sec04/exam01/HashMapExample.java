package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("고길동", 85);
        map.put("이길동", 80);
        map.put("이길동", 95);
        map.put("홍길동", 90);
        System.out.println("총 Entity 수 : " + map.size());
        System.out.println();

        String key = "고길동";
        int value = map.get(key);
        System.out.println(key + ":" + value);
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + ":" + v);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("총 Entity 수 : " + map.size());
    }
}
