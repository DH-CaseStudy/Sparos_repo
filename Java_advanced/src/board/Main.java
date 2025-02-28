package board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
        System.out.println("메뉴를 고르시오");
        System.out.println("1.전체조회 2.입력 3.업데이트 4.개별조회 5.삭제");

        String input = br.readLine();

            switch (input) {
                case "1":
                    BoardSelectAll boardSelectAll = new BoardSelectAll();
                    boardSelectAll.BoardSelectAll();
                    break;
                case "2":
                    BoardInsert boardInsert = new BoardInsert();
                    System.out.println("제목을 입력하세요.");
                    String title = br.readLine();
                    System.out.println("내용을 입력하세요.");
                    String content = br.readLine();
                    System.out.println("작성자를 입력하세요");
                    String writer = br.readLine();
                    boardInsert.BoardInsert(title, content, writer);
                    break;
                case "3":
                    BoardUpdate boardUpdate = new BoardUpdate();
                    System.out.println("내용을 입력하세요.");
                    String content2 = br.readLine();
                    System.out.println("작성자를 입력하세요");
                    String writer2 = br.readLine();
                    boardUpdate.BoardUpdate(writer2, content2);
                    break;
                case "4":
                    BoardSelectOne boardSelectOne = new BoardSelectOne();
                    System.out.println("작성자를 입력하세요");
                    String writer3 = br.readLine();
                    boardSelectOne.SelectOne(writer3);
                    break;
                case "5":
                    BoardDelete boardDelete = new BoardDelete();
                    System.out.println("작성자를 입력하세요");
                    String writer4 = br.readLine();
                    boardDelete.DeleteBoard(writer4);
                    break;

                default:
                    System.out.println("잘못입력함");
                    break;
            }
        }


    }
}
