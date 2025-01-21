package car;

public class Car {
    private String model;
    private String owner;
    private int speed;

    public Car(String _model, String _owner, int _speed){
        this.model = _model;
        this.owner = _owner;
        this.speed = _speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void speedUp(){
        this.speed++;
    }

    public void speedDown(){
        this.speed--;
    }

}
