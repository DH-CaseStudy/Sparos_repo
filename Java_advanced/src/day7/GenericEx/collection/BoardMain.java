package day7.GenericEx.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) {
        List<Board> boardList = new ArrayList<Board>();

        boardList.add(new Board("제목1", "ssg1", "피곤하다"));
        boardList.add(new Board("제목2", "ssg2", "피곤하다"));
        boardList.add(new Board("제목3", "ssg3", "피곤하다"));

        for(Board board1 : boardList){
            System.out.println(board1.subject);
            System.out.println(board1.content);
            System.out.println(board1.write);
        }

        boardList.remove(0);

        for(Board board1 : boardList){
            System.out.println(board1.subject);
            System.out.println(board1.content);
            System.out.println(board1.write);
        }
    }

}
