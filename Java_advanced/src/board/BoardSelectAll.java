package board;

import com.mysql.cj.jdbc.Blob;

import java.sql.*;

public class BoardSelectAll {
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
                    .append("SELECT * FROM boards ").toString();

            PreparedStatement pstmt = connection.prepareStatement(query);
            //4. 쿼리문 실행
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Boards board = new Boards();
                board.setBno(rs.getString("bno"));
                board.setBtitle(rs.getString("btitle"));
                board.setBcontent(rs.getString("bcontent"));
                board.setBwriter(rs.getString("bwriter"));
                board.setBdate(rs.getDate("bdate"));
                board.setBfilename(rs.getString("bfilename"));
                board.setBfiledata((Blob) rs.getBlob("bfiledata"));
                System.out.println(board.toString());
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
