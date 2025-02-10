package day6.api;

import java.util.Arrays;

public class UserMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        User[] arrayObj = {new User("park", 100), new User("kim", 101), new User("kang", 102) };

        User[] arrayObj1 = new User[3];

        for(int i = 0; i < arrayObj1.length; i++){
            arrayObj1[i] = (User) arrayObj[i].clone();
        }

//        arrayObj1 = arrayObj.clone();

        arrayObj1[0].setId(999); //복제 후 첫번째 인덱스 값 변경

        System.out.println(arrayObj[0].getId());
        System.out.println(arrayObj1[0].getId());
        //복제되는 대상이 배열의 요소데이터인 Object.clone() 오버라이딩을 해줌으로서 내부적으로 for문을 돌며 객체복사 해주는 것과 같은 의미.


//        User user = new User();
//        user.setName("이동휘");
//        User copy = user; //얕은 복사 (주소값만 넣어줬다)

//        System.out.println(user.hashCode());
//        System.out.println(copy.hashCode());
//        System.out.println(user.equals(copy));
//
//        User user1 = new User();
//        user1.setName("이동휘");
//        try {
//            User copy1 = (User) user1.clone(); //깊은 복사 (주소값만 넣는게아니라 아예 새로운 주소로 할당)
//
//            System.out.println(user1.hashCode());
//            System.out.println(copy1.hashCode());
//            System.out.println(user1.equals(copy1));
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
