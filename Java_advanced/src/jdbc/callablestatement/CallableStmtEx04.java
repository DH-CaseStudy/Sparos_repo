
package jdbc.callablestatement;

import java.sql.ResultSet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CallableStmtEx04 {
    Connection connection = null;
    CallableStatement cstmt = null;
    ResultSet rs = null;

    public CallableStmtEx04() throws SQLException {
//        List<User> user = new ArrayList<>();
        connection = DBUtil.getConnection();

        cstmt = connection.prepareCall("{call SP_MEMBER_LIST()}");

        rs = cstmt.executeQuery();

        int i = 1;

        while (rs.next()) {
            String seq = rs.getString("m_seq");
            String userid = rs.getString("m_userid");
            String pwd = rs.getString("m_pwd");
            String email = rs.getString("m_email");
            String hp = rs.getString("m_hp");
            Date date = rs.getDate("m_registdate");
            Time time = rs.getTime("m_registdate");

            System.out.println(seq +  " " + userid + " " + pwd + " " + email + " " + hp + " " + date + " " + time );

        }

        connection.close();
        cstmt.close();
        rs.close();
    }

    public static void main(String[] args) throws SQLException {
        new CallableStmtEx04();
    }
}
