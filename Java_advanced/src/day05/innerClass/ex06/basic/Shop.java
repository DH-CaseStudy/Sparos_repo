package day05.innerClass.ex06.basic;

public class Shop {
    public static void main(String[] args) {
        Hamburger hamburger1 = new Hamburger(2, 1, 2, 4, 6, 8);
        Hamburger hamburger2 = new Hamburger(2,1,1);
        Hamburger hamburger3 = new Hamburger(2, 1, 3, 4, 5, 6);

    }
}

//생성자 만으로 필드를 선택적으로 생략할 수 없는 방식
//타입이 다양할 수