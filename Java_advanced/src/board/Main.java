package board;

import com.mysql.cj.jdbc.Blob;

import java.io.*;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1 모두 출력, 2 입력, 3 삭제, 4 선택 출력, 5 업데이트");
        String strNum = br.readLine();

        switch (strNum) {
            case "1":
                boardSelectAll(); break;
            case "2":
                System.out.println("제목을 입력하세요.");
                String title = br.readLine();

                System.out.println("제목을 입력하세요.");
                String content = br.readLine();

                System.out.println("제목을 입력하세요.");
                String writer4 = br.readLine();
                boardInsert(title, content, writer4);break;
            case "3":
                System.out.println("지우려는 게시물의 작성자를 입력하시오.");
                String writer1 = br.readLine();
                boardDelete(writer1);break;
            case "4":
                System.out.println("출력하려는 게시물의 작성자를 입력하시오.");
                String writer2 = br.readLine();
                boardSelectOne(writer2);break;
            case "5":
                System.out.println("업데이트 하려는 게시물의 내용을 입력하시오.");
                String content2 = br.readLine();
                System.out.println("출력하려는 게시물의 작성자를 입력하시오.");
                String writer3 = br.readLine();
                boardUpdate(content2, writer3);break;
            default:
                System.out.println("잘못된 입력");
        }



    }

    public static void boardInsert(String title, String content, String writer) {
        Connection connection = null;

        try {

            //1 jdbc driver 등록 : MYSQL DB 접근 하기 우히ㅏㄴ 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 로드 완료!");

            //2 mysql 특정 db와 특정 계정으로 연결
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ssg?serverTimezone=Asia/Seoul", "root", "3546");
            System.out.println("디비 연결 완료");

            //3 매개 변수화 된 SQL 문 작성
            String query = "" +
                    "INSERT INTO boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata) " +
                    "VALUES (?, ?, ?, now(), ?, ?)";

            PreparedStatement pstmt = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS); //bno 값을 가져오기 위해

            pstmt.setString(1, title);
            pstmt.setString(2, writer);
            pstmt.setString(3, content);
            pstmt.setString(4, "spring.jpg");
            pstmt.setBlob(5, new FileInputStream("src/images/spring.jpg"));

            //4. 쿼리문 실행
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " rows affected");

            // bno값이 제대로 들어가는지

            if(rows == 1){
                ResultSet rs = pstmt.getGeneratedKeys();

                if(rs.next()){
                    int bno = rs.getInt(1);
                    System.out.println(bno);
                }
                rs.close();
            }

            pstmt.close();

        } catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
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

    public static void boardDelete(String writer){
        Connection connection = null;

        try {

            //1 jdbc driver 등록 : MYSQL DB 접근 하기 우히ㅏㄴ 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 로드 완료!");

            //2 mysql 특정 db와 특정 계정으로 연결
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ssg?serverTimezone=Asia/Seoul", "root", "3546");
            System.out.println("디비 연결 완료");

            //3 매개 변수화 된 SQL 문 작성
            String query = new StringBuilder()
                    .append(" Delete from boards ")
                    .append(" WHERE bwriter = ? ").toString();

            PreparedStatement pstmt = connection.prepareStatement(query);

            pstmt.setString(1, writer);


            //4. 쿼리문 실행
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " rows affected");
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

    public static void boardSelectAll(){
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
                board.setBno(rs.getInt("bno"));
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

    public static void boardSelectOne(String writer){
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
                    .append("SELECT * FROM boards ")
                    .append("WHERE bwriter = ? ").toString();

            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, writer);

            //4. 쿼리문 실행
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

    public static void boardUpdate(String updateContent, String writer) {
        Connection connection = null;

        try {

            //1 jdbc driver 등록 : MYSQL DB 접근 하기 우히ㅏㄴ 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 로드 완료!");

            //2 mysql 특정 db와 특정 계정으로 연결
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ssg?serverTimezone=Asia/Seoul", "root", "3546");
            System.out.println("디비 연결 완료");

            //3 매개 변수화 된 SQL 문 작성
            String query = new StringBuilder()
                    .append(" UPDATE boards SET ")
                    .append(" btitle = ? ")
                    .append(" WHERE bwriter = ? ").toString();

            PreparedStatement pstmt = connection.prepareStatement(query);

            pstmt.setString(1, updateContent);
            pstmt.setString(2, writer);


            //4. 쿼리문 실행
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " rows affected");
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
