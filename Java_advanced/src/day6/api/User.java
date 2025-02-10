package day6.api;

public class User implements Cloneable{
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

//    public void setName(String name) {
//        this.name = name;
//    }


//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}
