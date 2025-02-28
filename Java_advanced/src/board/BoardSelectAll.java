package board;

import com.mysql.cj.jdbc.Blob;
import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class BoardSelectAll {

    public void BoardSelectAll(){
        String query = new StringBuilder()
                .append("SELECT * FROM boards").toString();

        try(Connection connection = DBConnection.getConnection();
            PreparedStatement pstmt =  connection.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();)
        {


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

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) {
//
//        ResultSet rs = null;
//        String query = new StringBuilder()
//                .append("SELECT * FROM boards").toString();
//
//        try(Connection connection = DBConnection.getConnection();
//        PreparedStatement pstmt =  connection.prepareStatement(query)){
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
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
}
