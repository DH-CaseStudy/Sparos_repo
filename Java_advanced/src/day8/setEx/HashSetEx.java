package day8.setEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        //객체

        set.add("Java");
        set.add("Java");
        set.add("Programming");
        set.add("perfect");
        set.add("Spring");

        System.out.println(set.size());
    }
}
