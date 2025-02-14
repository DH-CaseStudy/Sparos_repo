package day9.lambda.ex03;

public class Person {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



    public void action4(Calculable calculable) {
        calculable.calculate(this.x, this.y);
    }

    public Person(int x , int y) {
        this.x = x;
        this.y = y;
    }


    public void action(Calculable calculable){
        double result = calculable.calculate(20, 5);
        System.out.println("결과 " +result);
    }
}

//홍길동 씨가 프로그래밍을 합니다
//"프로그래밍은 정말 재미있어" 라고 말합니다.
