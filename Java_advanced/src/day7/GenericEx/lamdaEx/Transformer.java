package day7.GenericEx.lamdaEx;

@FunctionalInterface
public interface Transformer<T,R> { //T를 매개변수로 R을 반환
    R transfrom(T input);
}
