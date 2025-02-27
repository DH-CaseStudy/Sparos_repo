package jdbc.users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsert {
    public static void main(String[] args) {
        Connection connection = null;

        try {

            //1 jdbc driver 등록 : MYSQL DB 접근 하기 우히ㅏㄴ 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 로드 완료!");

            //2 mysql 특정 db와 특정 계정으로 연결
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ssg?serverTimezone=Asia/Seoul", "root", "3546");
            System.out.println("디비 연결 완료");

            //3 매개 변수화 된 SQL 문 작성
            String query = "" +
                            "INSERT INTO users (userid, username, userpassword, userage, useremail) " +
                            "VALUES (?, ?, ?, ?, ?)";

            PreparedStatement pstmt = connection.prepareStatement(query);

            pstmt.setString(1, "ehdgnl");
            pstmt.setString(2, "이동휘");
            pstmt.setString(3, "1234");
            pstmt.setInt(4, 32);
            pstmt.setString(5, "ehdgnl@gmail.com");

            //4. 쿼리문 실행
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " rows affected");
            pstmt.close();

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
