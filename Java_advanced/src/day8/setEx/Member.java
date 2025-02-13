package day8.setEx;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        //name과 age가 같다면 true 리턴해라
        if(obj instanceof Member target){
            return target.name.equals(this.name) && (target.age == this.age);
        } else {
            return  false;
        }
    }

    @Override //객체 동등비교하기 위해
    public int hashCode() {
        //name과 age가 같다면 동일한 해시코드가 리턴.
        return name.hashCode() + age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
