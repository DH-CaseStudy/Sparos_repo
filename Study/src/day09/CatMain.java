package day09;

public class CatMain {
    public static void main(String[] args) {
        Parent momcat = new Parent();
        String breed = momcat.getBreed();
        System.out.println(breed);
        momcat.methodParent();

        Parent momcat1 = new Parent();
        momcat1.setBreed("점박이");
        System.out.println(momcat1.getBreed());
        momcat1.methodParent();

        Kitten kitty = new Kitten();
        kitty.setBreed("스핑크스");
        kitty.methodParent();
        kitty.methodkitten();
    }
}
