package day8.setEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        Set<Member> memberSet = new HashSet<>();

        memberSet.add(new Member("홍길동", 30));
        memberSet.add(new Member("홍길순", 30));
        memberSet.add(new Member("홍길자", 30));
        memberSet.add(new Member("홍길용", 30));

        for(Member member : memberSet){
            System.out.println(member);
        }

        Iterator<Member> iterator = memberSet.iterator();
        while (iterator.hasNext()){

            Member member = iterator.next();
            System.out.println(member.name);
            iterator.remove();
            int size  = memberSet.size();
            System.out.println(size);
        }
    }
}
