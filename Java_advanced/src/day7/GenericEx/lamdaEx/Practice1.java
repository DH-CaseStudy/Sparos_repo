package day7.GenericEx.lamdaEx;

import java.util.Arrays;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이동휘", "이동휘2");
        names.forEach(name -> System.out.println(name));
    }
}
