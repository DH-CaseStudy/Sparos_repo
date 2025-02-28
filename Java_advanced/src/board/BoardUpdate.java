package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdate {

    public void BoardUpdate(String bwriter, String content) {
        //3 매개 변수화 된 SQL 문 작성
        String query = new StringBuilder()
                .append(" UPDATE boards SET ")
                .append(" bcontent = ? ")
                .append(" WHERE bwriter = ? ").toString();

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(query)) {

            pstmt.setString(1, content);
            pstmt.setString(2, bwriter);

            //4. 쿼리문 실행
            int rows = pstmt.executeUpdate();
//            System.out.println(rows + " rows affected");
//            DBConnection.closeConnection();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) {
//
//        //3 매개 변수화 된 SQL 문 작성
//        String query = new StringBuilder()
//                .append(" UPDATE boards SET ")
//                .append(" btitle = ? ")
//                .append(" WHERE bwriter = ? ").toString();
//
//        try (Connection connection = DBConnection.getConnection();
//             PreparedStatement pstmt = connection.prepareStatement(query)) {
//
//            pstmt.setString(1, "내용을 업데이트 했습니다");
//            pstmt.setString(2, "이동휘");
//
//            //4. 쿼리문 실행
//            int rows = pstmt.executeUpdate();
//            System.out.println(rows + " rows affected");
//            DBConnection.closeConnection();
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//
//    }
}
