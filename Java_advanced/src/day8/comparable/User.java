package day8.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User implements Comparable<User> {

    private String name;
    private int age;

    @Override
    public int compareTo(User o) {
        if(this.name.charAt(0) > o.name.charAt(0)){
            return 1; //오름
        } else if(this.name.charAt(0) == o.name.charAt(0)){
                return o.age - this.age; //이름이 같다면 age 오름차순
        } else {
            return -1; // 내림
        }
    }
}
