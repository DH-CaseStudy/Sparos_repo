package board;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class BoardInsert {

    public void BoardInsert(String title, String content, String writer)
    {
        String query = "" +
                "INSERT INTO boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata) " +
                "VALUES (?, ?, ?, now(), ?, ?)";

        try(Connection connection = DBConnection.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(query)){

            pstmt.setString(1, title);
            pstmt.setString(2, content);
            pstmt.setString(3, writer);
            pstmt.setString(4, "spring.jpg");
            pstmt.setBlob(5, new FileInputStream("src/images/spring.jpg"));

            int rows = pstmt.executeUpdate();
            System.out.println(rows + " rows affected");

            // bno값이 제대로 들어가는지

//            if (rows == 1) {
//                ResultSet rs = pstmt.getGeneratedKeys();
//
//                if (rs.next()) {
//                    int bno = rs.getInt(1);
//                }
//                rs.close();
//            }

//            DBConnection.closeConnection();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
//    public static void main(String[] args) {
//
//
//        String query = "" +
//                "INSERT INTO boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata) " +
//                "VALUES (?, ?, ?, now(), ?, ?)";
//
//        try(Connection connection = DBConnection.getConnection();
//        PreparedStatement pstmt = connection.prepareStatement(query)){
//
//            pstmt.setString(1, "좀 덥다");
//            pstmt.setString(2, "덥긴덥네~");
//            pstmt.setString(3, "행인2");
//            pstmt.setString(4, "spring.jpg");
//            pstmt.setBlob(5, new FileInputStream("src/images/spring.jpg"));
//
//            int rows = pstmt.executeUpdate();
//            System.out.println(rows + " rows affected");
//
//            // bno값이 제대로 들어가는지
//
//            if (rows == 1) {
//                ResultSet rs = pstmt.getGeneratedKeys();
//
//                if (rs.next()) {
//                    int bno = rs.getInt(1);
//                }
//                rs.close();
//            }
//
//            DBConnection.closeConnection();
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//    }
}
