package day7.GenericEx.lamdaEx;

//Pair 클래스는 두 개의 타입 매개변수를 T와 U를 가진 제네릭 클래스이다. 서로 다른 타입의 두 객체를 가질 수 있다.
public class Pair<T,U> {
    private T firtst;
    private U second;

    public Pair(){

    }

    public Pair(T firtst, U second) {
        this.firtst = firtst;
        this.second = second;
    }

    public T getFirtst() {
        return firtst;
    }

    public U getSecond() {
        return second;
    }
}
