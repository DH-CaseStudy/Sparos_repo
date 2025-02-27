package jdbc.users;

import lombok.Data;

@Data
public class User {
    private String userid;
    private String username;
    private String password;
    private int userage;
    private String email;
}
