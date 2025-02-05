package day11_exam;

public class Member {

    private String name;
    private String id;
    private String password;
    private int age;

    public Member(String _name, String _id, String _password, int _age) {
        this.name = _name;
        this.id = _id;
        this.password = _password;
        this.age = _age;
    }

    public Member(String _name, String _id) {
        this.name = _name;
        this.id = _id;
    }

}
