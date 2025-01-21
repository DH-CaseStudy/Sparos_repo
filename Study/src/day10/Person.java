package day10;

public class Person {
    public String name;
    public int age;
    public String phoneNumber;
    public String gender;

    //디폴트 생성자.
    public Person(){

    }

    //디폴트 생성자.
    public Person(String _name, int _age, String _phoneNumber){
        this.name = _name;
        this.age = _age;
        this.phoneNumber = _phoneNumber;
    }

    //오버로딩
    public Person(String _name, int _age, String _phoneNumber, String _gender){
        this.name = _name;
        this.age = _age;
        this.phoneNumber = _phoneNumber;
        this.gender = _gender;
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
