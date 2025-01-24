package day13;

public class Calculator {

    private int width;
    private int hegiht;

    public Calculator(){

    }

    public Calculator(int _width, int _height){
        this.width = _width;
        this.hegiht = _height;
    }

    public void areaCompute() {
        System.out.println("사각형 넓이를 계산하는 기능을 수행합니다.");
        int result = this.hegiht * this.hegiht;
        System.out.println("계산이 끝났습니다. 면적은" +  result);
    }

}
