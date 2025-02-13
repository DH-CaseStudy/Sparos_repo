package day9.tree.treeset;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 1000);
        treeMap.put("banana", 1200);
        treeMap.put("grape", 1500);
        treeMap.put("pear", 2200);
        treeMap.put("cherry", 3200);

        //정렬된 entry

        Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet){
//            System.out.println(entry.getKey() + ": " +entry.getValue());
        }

//        System.out.println();

        Map.Entry<String, Integer> entry = null;
        entry = treeMap.firstEntry();
//        System.out.println(entry);

        NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();

        Set<Map.Entry<String, Integer>> descendingSet = descendingMap.entrySet();

        for(Map.Entry<String, Integer> e : descendingSet){
            System.out.println(e);
        }
    }
}
