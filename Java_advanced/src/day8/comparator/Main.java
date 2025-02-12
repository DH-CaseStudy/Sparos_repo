package day8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        class User {
            private String name;
            private int age;

            User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

        List<User> users = new ArrayList<User>();
        users.add(new User("홍길동", 21));
        users.add(new User("김영희", 24));
        users.add(new User("김병곤", 24));
        users.add(new User("이미진", 30));
        users.add(new User("홍길동", 23));

        Collections.sort(users, Comparator.comparing(User::getAge));

        for (User user : users) {
            System.out.println(user.name + " " + user.age + "세");
        }

        System.out.println("==========================");

        Collections.sort(users, Comparator.comparing(User::getName));

        for (User user : users) {
            System.out.println(user.name + " " + user.age + "세");
        }


        System.out.println("==========================");
        Collections.sort(users, Comparator.comparing(User::getAge).thenComparing(User::getName)); //나이 비교 후 이름 비교

        for (User user : users) {
            System.out.println(user.name + " " + user.age + "세");
        }

    }
}








