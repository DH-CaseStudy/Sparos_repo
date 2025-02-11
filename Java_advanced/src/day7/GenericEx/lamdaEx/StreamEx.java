package day7.GenericEx.lamdaEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("functional", "programming", "with", "generics", "in", "java");

        List<String> filteredWords = words.stream()
                .filter(word -> word.length() > 4).map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(filteredWords);
    }
}
