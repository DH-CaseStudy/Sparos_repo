package day01;

public class Phone {

    public String model;
    public String color;

//    public Phone() {
//
//    }

    public Phone(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("Phone (model, color) 생성자 실행");
    }

    public void bell(){
        System.out.println("ring irng");
    }
}
