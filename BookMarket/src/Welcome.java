import java.io.*;
import java.util.*;

public class Welcome {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final int bookCount = 3;
    static final int bookInfoCount = 7;
    Map<String, String[]> bookMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        String[][] mbook = new String[bookCount][bookInfoCount];
        ArrayList<String[]> cart = new ArrayList<>();
        boolean quit = false;

        IOUtils.write("당신의 이름을 입력하세요 : ");
        String userName = br.readLine();

        IOUtils.write("연락처를 입력하세요 : ");
        String phoneNumber = br.readLine();

        String greeting = "Welcome to Shopping Mall\n";
        String tagline = "Welcome to Book Market\n";

        while (!quit) {
            IOUtils.writeLine("*".repeat(80));
            IOUtils.write("\t " + greeting);
            IOUtils.write("\t " + tagline);

            menuIntroduction();

            IOUtils.write("메뉴 번호를 입력하세요. ");

            int menuNumber = Integer.parseInt(br.readLine());

            if (menuNumber < 1 || menuNumber > 8) {
                IOUtils.write("1부터 8까지의 숫자를 입력해주세요. ");
            } else {
                switch (menuNumber) {
                    case 1:
                        menuGuestInfo(userName, phoneNumber);
                        break;
                    case 2:
                        menuCartItemList();
                        break;
                    case 3:
                        menuCartClear();
                        break;
                    case 4:
                        menuCartAddItem(mbook);
                        break;
                    case 5:
                        menuCartRemoveItemCount();
                        break;
                    case 6:
                        menuCartRemoveItem();
                        break;
                    case 7:
                        menuCarBill();
                        break;
                    case 8:
                        menuExit();
                        quit = true;
                        break;
                }

            }
        }
    }

    public static void BookList(String[][] book) {

//        Scanner sc = new Scanner(System.in);
//        for(int i = 0; i < bookCount; i ++){
//            System.out.printf("%d 번째 정보를 입력하세요 : %n", i+1);
//            for(int j = 0; j < bookInfoCount; j++){
//                System.out.print("해당 책의 정보를 7번으로 나누어 입력하세요");
//                book[i][j] = sc.nextLine();
//            }
//        }

        book[0][0] = "ISBN1234";
        book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
        book[0][2] = "27000";
        book[0][3] = "송미영";
        book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
        book[0][5] = "IT전문서";
        book[0][6] = "2018/10/08";

        book[1][0] = "ISBN1235";
        book[1][1] = "안드로이드 프로그래밍";
        book[1][2] = "33000";
        book[1][3] = "우재남";
        book[1][4] = "실습 단계별 명쾌한 멘토링!";
        book[1][5] = "IT전문서";
        book[1][6] = "2022/01/22";

        book[2][0] = "ISBN1236";
        book[2][1] = "스크래치";
        book[2][2] = "22000";
        book[2][3] = "고광욱";
        book[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
        book[2][5] = "컴퓨터입문";
        book[2][6] = "2019/06/10";

    }

    public static void menuIntroduction() throws IOException {
        IOUtils.write("*".repeat(80) + "\n");

        IOUtils.write("1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기\n");
        IOUtils.write("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기\n");
        IOUtils.write("3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기\n");
        IOUtils.write("7. 영수증 표시하기 \t8. 종료\n");

        IOUtils.write("*".repeat(80) + "\n");
    }

    public static void menuGuestInfo(String username, String phonenumber) {
        IOUtils.write("현재 고객 정보\n");
        IOUtils.write("이름 " + username + "\n" + "연락처 " + phonenumber + "\n");
    }

    public static void menuCartItemList() {
        IOUtils.write("2. 장바구니 상품 목록 보기\n");
    }

    public static void menuCartClear() {
        IOUtils.write("3. 장바구니 비우기\n");
    }

    public static void menuCartAddItem(String[][] book) {
        //IOUtils.write("4. 장바구니에 항목 추가하기\n");

        BookList(book);

        for (int i = 0; i < bookCount; i++) {
            for (int j = 0; j < bookInfoCount; j++) {
                IOUtils.writeLine(book[i][j] + "|");
            }
        }

        boolean quit = false;

        while (!quit) {
            IOUtils.write("장바구니에 추가할 도서의 ID를 입력하세요 :");
            String str = IOUtils.readLine();

            boolean flag = false;
            int numId = -1;

            for (int i = 0; i < bookCount; i++) {
                if (str.equals((book[i][0]))) {
                    numId = i;
                    flag = true;
                    break;
                }
            }

            if (flag) {
                IOUtils.write("장바구니에 추가하시겠습니까? Y | N ");
                str = IOUtils.readLine();
                if (str.toUpperCase().equals("Y")) {
                    IOUtils.writeLine(book[numId][0] + "도서가 장바구니에 추가되었습니다."); // 새로운 리스트에 새로운 값들을 넣어주면 장바구니 개념?

                }
                quit = true;
            } else {
                IOUtils.writeLine("다시 입력해주세요.");
            }


        }
    }

    public static void menuCartRemoveItemCount() {
        IOUtils.write("5. 장바구니의 항목 수량 줄이기\n");
    }

    public static void menuCartRemoveItem() {
        IOUtils.write("6. 장바구니 항목 삭제하기\n");
    }

    public static void menuCarBill() {
        IOUtils.write("7. 영수증 표시하기\n");
    }

    public static void menuExit() {
        IOUtils.write("8. 종료\n");
    }

}
