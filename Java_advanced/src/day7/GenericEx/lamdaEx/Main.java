package day7.GenericEx.lamdaEx;

public class Main {
    //해당 코드에서 제네릭의 역할 : 타입의 정확성을 보장한다.
    public static void main(String[] args) {
        Transformer<Integer, String> intToString = (input -> "number: " + input);
        String result = intToString.transfrom(10); //int를 String 변환
        System.out.println(result + 1);

        Transformer<String, Integer> stringIntegerTransformer = (input -> input.length());
        Integer length = stringIntegerTransformer.transfrom("hello java programming");
        System.out.println(length);
    }
}
