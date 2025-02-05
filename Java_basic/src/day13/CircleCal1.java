package day13;

public class CircleCal1 extends CircleCal{

    @Override //어노테이션 마크
    public double areaCircle(double radius){
        //super.areaCircle(20);
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
//        CircleCal c1 = new CircleCal();
//        double result = c1.areaCircle(10);
//        System.out.println("원의면적 : " + result);
//
//        CircleCal1 c2 = new CircleCal1();
//        double result2 = c2.areaCircle(20);
//        System.out.println("원의면적 : " + result2);

        CircleCal c3 = new CircleCal1();
        double result3 = c3.areaCircle(30);
        System.out.println("원의면적 : " + result3);

    }
}
