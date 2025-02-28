package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDelete {

    public void DeleteBoard(String writer){
        String query = new StringBuilder()
                .append(" Delete from boards ")
                .append(" WHERE bwriter = ? ").toString();

        try(Connection connection = DBConnection.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(query)){

            pstmt.setString(1, writer);


            //4. 쿼리문 실행
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " rows affected");

//            DBConnection.closeConnection();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) {
//        String query = new StringBuilder()
//                .append(" Delete from boards ")
//                .append(" WHERE bwriter = ? ").toString();
//
//        try(Connection connection = DBConnection.getConnection();
//            PreparedStatement pstmt = connection.prepareStatement(query)){
//
//            pstmt.setString(1, "아무개");
//
//
//            //4. 쿼리문 실행
//            int rows = pstmt.executeUpdate();
//            System.out.println(rows + " rows affected");
//
//            DBConnection.closeConnection();
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
