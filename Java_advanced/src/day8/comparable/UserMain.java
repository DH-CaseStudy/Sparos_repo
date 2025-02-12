package day8.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserMain {
    public static void main(String[] args) {
        List<User> userArrayList = new ArrayList<>();

        userArrayList.add(new User("이동휘", 33));
        userArrayList.add(new User("김동휘", 32));
        userArrayList.add(new User("박동휘", 31));
        userArrayList.add(new User("최동휘", 30));
        userArrayList.add(new User("이동휘", 20));

        Collections.sort(userArrayList);

        userArrayList.forEach(System.out::println);
    }
}
