package jdbc.callablestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//싱글톤을 적용한 커넥션 객체
public class DBUtil {
    private static Connection connection = null; //내부에서 생성하여 선택적 공유할 수 있도록
    private static final String url = "jdbc:mysql://127.0.0.1:3306/ssg?serverTimezone=Asia/Seoul";
    private static final String user = "ssg";
    private static final String password = "3546";

    private DBUtil() {

    }

    public static Connection getConnection() {
        if (connection != null) {
            return connection;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC 드라이버 로드
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection;

    }

}
