package day13;

public class Computer extends Calculator{

    private double radius;
    private int width;
    private int hegiht;

    public Computer(int _width, int _height){
        this.width = _width;
        this.hegiht = _height;
    }

    public Computer(double _radius){
        this.radius = _radius;
    }

    public void areaCompute() {
        System.out.println("사각형 넓이를 계산하는 기능을 수행합니다.");
        double result = Math.PI * this.radius * this.radius;
        System.out.printf("계산이 끝났습니다. 면적은 %.1f",  result);
    }

    public static void main(String[] args) {
        //사각형의 면적을 구하시오
       Calculator calculator = new Calculator(10, 20);
       calculator.areaCompute();

       Computer computer = new Computer(5);
       computer.areaCompute();

       Calculator calculator1 = new Computer(10 , 20);
       calculator1.areaCompute();
    }
}
