package jdbc.callablestatement;

import java.util.Date;

public class User {
    private String userid;
    private String password;
    private String email;
    private String hp;
    private String date;

    public User() {}

    public User(String userid, String password, String email, String hp, String date) {
        this.userid = userid;
        this.password = password;
        this.email = email;
        this.hp = hp;
        this.date = date;
    }


    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", hp='" + hp + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
