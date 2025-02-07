package day05.innerClass.ex06.builderpattern;

public class Shop {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger.BurgerBuilder("플랫", "쇠고기" , "콜라").addCheese().addBacon()
                .addTomato().addLettuce().build();
        System.out.println(hamburger);
    }
}

//기본 생성자 오버로딩의 가독성 문제가 해결됨.
//일관성 문제
//불변성 문제