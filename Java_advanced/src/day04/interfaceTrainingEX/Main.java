package day04.interfaceTrainingEX;

public class Main {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        ClassC c = new ClassC();

        action(b);
        action(c);

    }

    public static void action(A a){

        if(a instanceof ClassB){
            a.method1();
        } else if(a instanceof ClassC c) {
            c.method2();
        }

    }

}
