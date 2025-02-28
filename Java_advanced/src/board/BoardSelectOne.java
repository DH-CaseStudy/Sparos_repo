package board;

import com.mysql.cj.jdbc.Blob;

import java.sql.*;

public class BoardSelectOne {

    public void SelectOne(String bwriter) {
        ResultSet rs = null;
        String query = new StringBuilder()
                .append("SELECT * FROM boards ")
                .append("WHERE bwriter = ? ").toString();

        try(Connection connection = DBConnection.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(query) ){
            pstmt.setString(1, bwriter);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                Boards board = new Boards();
                board.setBno(rs.getInt("bno"));
                board.setBtitle(rs.getString("btitle"));
                board.setBcontent(rs.getString("bcontent"));
                board.setBwriter(rs.getString("bwriter"));
                board.setBdate(rs.getDate("bdate"));
                board.setBfilename(rs.getString("bfilename"));
                board.setBfiledata((Blob) rs.getBlob("bfiledata"));
                System.out.println(board.toString());
            }
//
//            DBConnection.closeConnection();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
//    public static void main(String[] args) {
//
//        ResultSet rs = null;
//        String query = new StringBuilder()
//                .append("SELECT * FROM boards ")
//                .append("WHERE bwriter = ? ").toString();
//
//        try(Connection connection = DBConnection.getConnection();
//        PreparedStatement pstmt = connection.prepareStatement(query) ){
//            pstmt.setString(1, "행인1");
//
//            rs = pstmt.executeQuery();
//
//            while (rs.next()) {
//                Boards board = new Boards();
//                board.setBno(rs.getInt("bno"));
//                board.setBtitle(rs.getString("btitle"));
//                board.setBcontent(rs.getString("bcontent"));
//                board.setBwriter(rs.getString("bwriter"));
//                board.setBdate(rs.getDate("bdate"));
//                board.setBfilename(rs.getString("bfilename"));
//                board.setBfiledata((Blob) rs.getBlob("bfiledata"));
//                System.out.println(board.toString());
//            }
//
//            DBConnection.closeConnection();
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
}
