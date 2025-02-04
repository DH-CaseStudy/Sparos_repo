package day02.Seald;

public sealed class Person permits Employee, Manager {

    public String name;

    public void work(){
        System.out.println("test");
    }
}
