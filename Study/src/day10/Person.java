package day10;

public class Person {
    private String name;
    private int age;
    private String phoneNumber;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


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
