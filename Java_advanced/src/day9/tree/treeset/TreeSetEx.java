package day9.tree.treeset;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        //Treeset 컬렉션 생성
        TreeSet<Integer> course = new TreeSet<>();
        course.add(100);
        course.add(28);
        course.add(60);
        course.add(19);
        course.add(58);

        for(Integer s : course){
            System.out.println(s); //별다른 설정없이 오름차순.
            System.out.println(); //별다른 설정없이 오름차순.
        }

        System.out.println("가장 낮은 점수 : " + course.first()); //젤 첫번째
        System.out.println("가장 높은 점수 : " + course.last());
        System.out.println("60 기준 : " + course.lower(60));
        System.out.println("60 기준 : " + course.higher(60));
        System.out.println("60 기준 : " + course.ceiling(54));
        System.out.println("60 기준 : " + course.floor(54));

        NavigableSet<Integer> descScores = course.descendingSet();
        for (Integer descScore : descScores) {
            System.out.println();
        }

        NavigableSet<Integer> rangeSet = course.tailSet(80, true);
        for(Integer score : rangeSet){
            System.out.println(score);
        }

        rangeSet = course.subSet(10,true,50,false);
        for(Integer s : rangeSet){
            System.out.println("s : " + s);
        }

        //범위 검색.
    }
}
