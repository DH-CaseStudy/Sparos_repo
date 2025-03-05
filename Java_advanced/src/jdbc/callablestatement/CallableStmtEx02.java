
package jdbc.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStmtEx02 {
    Connection connection = null;
    CallableStatement cstmt = null;

    public CallableStmtEx02() throws SQLException {

        connection = DBUtil.getConnection();

        cstmt = connection.prepareCall("{call inputWithResult(?, ?, ?)}"); // ? : cData ? : cTname ? : resultMsg

        cstmt.setString(1, "IT 서비스 기획자");
        cstmt.setString(2, "CODE1");

        // out 파라미터에 저장된 프로시저의 수행 결과를 출력해야함.
        cstmt.registerOutParameter(3, java.sql.Types.VARCHAR);

        boolean flag = cstmt.execute();

        System.out.println(flag);

        if(cstmt !=  null) cstmt.close();
        if(connection != null) connection.close();
    }

    public static void main(String[] args) throws SQLException {
        new CallableStmtEx02();
    }
}
