package day05.innerClass.ex06.javabeans;

public class Shop {
    public static void main(String[] args) {
        Hamburger hamburger1 = new Hamburger();
        hamburger1.setBun(2);
        hamburger1.setBacon(3);
        hamburger1.setCheese(1);

        Hamburger hamburger2 = new Hamburger();
        Hamburger hamburger3 = new Hamburger();

    }
}

//기본 생성자 오버로딩의 가독성 문제가 해결됨.
//일관성 문제
//불변성 문제