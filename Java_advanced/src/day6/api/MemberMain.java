package day6.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MemberMain {
    public static void main(String[] args) {
        Member m1 = new Member("신세계");
        Member m2 = new Member("신세계");

//        //컴퓨터 관점.
//        System.out.println(m1 == m2);
//        //사용자 관점으로 재정의
//        System.out.println(m1.equals(m2));

        System.out.println(System.identityHashCode(m1));
        System.out.println(System.identityHashCode(m2));

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());

        List<Member> memberList = new ArrayList<>();
        memberList.add(m1);
        memberList.add(m2);

        System.out.println(memberList.size());
        System.out.println(memberList.get(0).name);

        Set<Member> memberSet = new HashSet<>();
        memberSet.add(m1);
        memberSet.add(m2);

        System.out.println(memberSet.size());
        //해쉬값을 사용하는 컬렉션은
    }
}
