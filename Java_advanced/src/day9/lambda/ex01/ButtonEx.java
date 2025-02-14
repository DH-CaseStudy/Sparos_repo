package day9.lambda.ex01;

public class ButtonEx {
    public static void main(String[] args) {
        Button btn = new Button();

        btn.setClickListener(() -> System.out.println("버튼이 클릭 되었습니다")); //버튼 이벤트 등록
        btn.click();

        Button cancelbtn = new Button();
        cancelbtn.setClickListener(() -> System.out.println("취소"));
        cancelbtn.click();
    }
}
