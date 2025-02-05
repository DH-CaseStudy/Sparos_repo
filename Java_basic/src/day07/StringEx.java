package day07;

public class StringEx {
    public static void main(String[] args) {
        String name1 = "신세계";
        String name2 = "신세경";

        String name3 = new String("신세계");
        String name4 = new String("신세경");
        String name5 = new String("하하하");

        System.out.println("name1 : " + name1.hashCode());
        System.out.println("name2 : " + name2.hashCode());
        System.out.println("name3 : " + name3.hashCode());
        System.out.println("name4 : " + name4.hashCode());
        System.out.println("name5 : " + name5.hashCode());
    }
}
