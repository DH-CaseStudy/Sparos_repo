package day09;

public class Parent {
    private String breed = "샴 고양이";
    void methodParent(){
        System.out.println("어미 고양이 미야오!");
    }

    public String getBreed(){
        return  breed;
    }

    public void setBreed(String _breed){
        breed = _breed;
    }
}

class Kitten extends Parent{
    void methodkitten(){
        System.out.println("아기 고양이 미야오~");
    }

    void methodParent(){
        System.out.println("어미 고양이 미야오!");
    }
}

