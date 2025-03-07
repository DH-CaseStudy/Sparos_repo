
package jdbc.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStmtEx03 {
    Connection connection = null;
    CallableStatement cstmt = null;

    public CallableStmtEx03() throws SQLException {

        connection = DBUtil.getConnection();

        cstmt = connection.prepareCall("{call SP_MEMBER_INSERT(?, ?, ?, ?, ?)}"); // ? : cData ? : cTname ? : resultMsg

        cstmt.setString(1, "ehdehdgnl");
        cstmt.setString(2, "421121223");
        cstmt.setString(3, "ehdgnl@mail.com");
        cstmt.setString(4, "010-0000-0000");

        // out 파라미터에 저장된 프로시저의 수행 결과를 출력해야함.
        cstmt.registerOutParameter(5, Types.INTEGER);

        cstmt.execute();

        int rtn = cstmt.getInt(5);
        System.out.println(rtn);

        if(rtn == 100) {
            System.out.println("이미 존재하는 아이디 입니다.");
            connection.rollback();
        } else {
            System.out.println("가입 완료");
            if(cstmt !=  null) cstmt.close();
            if(connection != null) connection.close();
        }

    }

    public static void main(String[] args) throws SQLException {
        new CallableStmtEx03();
    }
}
