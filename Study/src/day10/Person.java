package day10;

public class Person {
    public String name;
    public int age;
    public String phoneNumber;

    //디폴트 생성자.
    public Person(){

    }

    public void work(){
        System.out.println("일 하다.");
    }

    public void eat(){
        System.out.println("먹다.");
    }

    public  void walk(){
        System.out.println("걷다.");
    }
}
