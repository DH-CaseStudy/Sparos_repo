package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String url = "jdbc:mysql://localhost:3306/board";
    private static final String user = "root";
    private static final String password = "root";

    private static Connection connection = null; //싱글톤

    private DBConnection() {

    }

    public static Connection getConnection() {
        try {
            if(connection == null) {
                Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC 드라이버 로드
                connection = DriverManager.getConnection(url, user, password);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }

    public static void closeConnection() {
        try {
            if(connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
