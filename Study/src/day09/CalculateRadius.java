package day09;

public class CalculateRadius {
    public static void main(String[] args) {
        double radius = Math.ceil(CalculateRadius(2.7));
        System.out.println(radius);
    }

    public static double CalculateRadius(double x){
        return 2 * x * 3.14;
    }
}
