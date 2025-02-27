package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
//    public static void main(String[] args) {
//        Connection connection = null;
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("드라이버 연결 완료");
//
//            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/극장데이터베이스?serverTimezone=Asia/Seoul", "root", "3546");
//            System.out.println("데이터베이스 연결 완료" + connection);
//        } catch (ClassNotFoundException e) {
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if(connection != null) {
//                try {
//                    connection.close();
//                    System.out.println(connection + "연결 종료");
//                } catch (SQLException e) { e.printStackTrace(); }
//
//            }
//        }

//    }
}
