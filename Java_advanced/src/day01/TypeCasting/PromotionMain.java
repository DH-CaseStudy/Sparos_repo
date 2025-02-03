package day01.TypeCasting;

public class PromotionMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = cat;
        //cat 과 animal은 클래스 타입만 다를 뿐이지 동일한 Cat객체를 참조한다.
        System.out.println(cat.hashCode());
        System.out.println(animal.hashCode());
    }
}
