package jdbc.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStmtEx01 {
    Connection connection = null;
    CallableStatement cstmt = null;

    public CallableStmtEx01() throws SQLException {

        connection = DBUtil.getConnection();

        cstmt = connection.prepareCall("{call input(?, ?)}"); // ? : cData ? : cTname

        cstmt.setString(1, "유니티 개발자");
        cstmt.setString(2, "CODE1");

        boolean flag = cstmt.execute();

        System.out.println(flag);

        if(cstmt !=  null) cstmt.close();
        if(connection != null) connection.close();
    }

    public static void main(String[] args) throws SQLException {
        new CallableStmtEx01();
    }
}
