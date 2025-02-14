package day9.lambda.ex02;
//이름 , 직무명을 갖는 단일 추상 메소드.
@FunctionalInterface
public interface Workable {
    void work(String name, String job);
}
