package day6.api;

import java.util.Objects;

public class Member extends Object{
    String id;
    String name;

    public Member(String name) {
        this.name = name;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name); //name필드 데이터 까지 같
    }

    @Override
    public boolean equals(Object obj){ //Object equlas() 메서드 재정의
//        if(obj instanceof Member target){ //obj Member 타입인지 검사하고 ~
//            if(name.equals(target.name)){ //문자열이 같은지 비교~
//                return true;
//            }
//        }
//
//        return false;
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return true;
        Member member = (Member) obj;
        return Objects.equals(name, member.name);
    }
}
