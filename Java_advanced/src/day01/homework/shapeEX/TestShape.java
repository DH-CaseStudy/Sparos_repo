package day01.homework.shapeEX;

public class TestShape {
	public static void main(String[] args) {
		Shape[] shape = new Shape[2];

		shape[0] = new Circle(100);
		shape[0].calculationArea();

		shape[1] = new Rectangular(100.0, 2.0);
		shape[1].calculationArea();
		
	}
}