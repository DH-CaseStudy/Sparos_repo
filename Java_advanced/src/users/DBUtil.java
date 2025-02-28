package users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * packageName   : jdbc.advanced.users
 * fileName      : DBUtil
 * author        : a
 * date          : 2025-02-28
 * description   : 데이터베이스 연결 작업 클래스
 * =================================================
 * DATE             AUTHOR             NOTE
 * -------------------------------------------------
 * 2025-02-28        a
 */
public class DBUtil {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/ssg?serverTimezone=Asia/Seoul";
    private static final String user = "root";
    private static final String password = "3546";

    private static Connection getConnection = null;

    public static Connection getConnection() {
        try {
            if (getConnection == null || getConnection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC 드라이버 로드
                getConnection = DriverManager.getConnection(url, user, password);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return getConnection;
    }
}
