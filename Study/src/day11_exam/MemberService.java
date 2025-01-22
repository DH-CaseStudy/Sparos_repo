package day11_exam;

public class MemberService {
    private String id;
    private String password;

    public boolean login(String _id, String _password){
        this.id = _id;
        this.password = _password;

        return this.id.equals("hong") && this.password.equals("12345");
    }

    public void logout(){
        this.id = null;
        this.password = null;
    }
}
