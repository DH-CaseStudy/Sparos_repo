package day01.inheritance.inheritance_01ex;

import java.util.ArrayList;

class Shape{

}
class Rectangle extends Shape{

}
class Triangle extends Shape{

}
class Circle extends Shape{

}
public class ShapeMain {
    public static void main(String[] args) {
        ArrayList<Shape> shapeArrayList = new ArrayList<>();
        shapeArrayList.add(new Rectangle());
        shapeArrayList.add(new Rectangle());
        shapeArrayList.add(new Rectangle());
        shapeArrayList.add(new Triangle());
        shapeArrayList.add(new Triangle());
        shapeArrayList.add(new Circle());
        shapeArrayList.forEach(System.out::println);
    }


}
