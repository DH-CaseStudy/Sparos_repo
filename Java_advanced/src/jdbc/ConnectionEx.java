package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {
    public static void main(String[] args) throws ClassNotFoundException {

        Connection connection = null;

        try {

            //1 jdbc dirver를 등록 : MYSQL DB 접근 하기 우히ㅏㄴ 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 로드 완료!");

            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/극장데이터베이스?serverTimezone=Asia/Seoul", "root", "3546");
            System.out.println("디비 연결 완료");
        } catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e);
        } finally {
            if(connection != null) {
                try{
                    connection.close();
                    System.out.println("연결 종료");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
