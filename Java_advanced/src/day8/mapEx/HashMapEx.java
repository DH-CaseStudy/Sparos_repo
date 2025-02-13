package day8.mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //객체저장

        map.put("최문규", 100);
        map.put("이동휘", 100);
        map.put("신민혁", 100);
        System.out.println(map.size());
        System.out.println("=============");

        //키로 값을 얻기
        String key = "이동휘";
        int value = map.get(key);
        System.out.println(value);

        //키 Set 컬렉션을 얻고, iterator 통해서 값을 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyiter = keySet.iterator();

        while(keyiter.hasNext()){
            String k = keyiter.next();
            Integer v = map.get(k);

            System.out.println(k);
            System.out.println(v);
            String name = String.valueOf(map.remove(v));
            System.out.println(name + " : 제거");
        }
    }
}
