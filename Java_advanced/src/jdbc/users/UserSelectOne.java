package jdbc.users;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class UserSelectOne {
    public static void main(String[] args) {
        Connection connection = null;
        ResultSet rs = null;

        try {

            //1 jdbc driver 등록 : MYSQL DB 접근 하기 우히ㅏㄴ 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 로드 완료!");

            //2 mysql 특정 db와 특정 계정으로 연결
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ssg?serverTimezone=Asia/Seoul", "root", "3546");
            System.out.println("디비 연결 완료");

            //3 매개 변수화 된 SQL 문 작성
            String query = new StringBuilder()
                            .append("SELECT * FROM users ")
                            .append("WHERE userid = ? ").toString();

            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, "ssgcom1");

            //4. 쿼리문 실행
            rs = pstmt.executeQuery();

            while (rs.next()) {
                User user = new User();
                user.setUserid(rs.getString("userid"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("userpassword"));
                user.setUserage(rs.getInt("userage"));
                user.setEmail(rs.getString("useremail"));
                System.out.println(user.toString());
            }

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
