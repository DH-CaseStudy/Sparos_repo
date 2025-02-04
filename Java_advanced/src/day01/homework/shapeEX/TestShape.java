package day01.homework.shapeEX;

public class TestShape {
	public static void main(String[] args) {
		Shape[] shape = new Shape[2];

		shape[0] = new Circle(10);
		shape[0].calculationArea();
		System.out.printf("원의 면적은 ");
		shape[0].print();

		shape[1] = new Rectangular(100.0, 2.0);
		shape[1].calculationArea();
		System.out.printf("직사각형의 면적은 ");
		shape[1].print();
		
	}
}