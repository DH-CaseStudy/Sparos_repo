package day10.dto;

public class CarDTO { //자동차의 데이터와 기능
    private String model;   //null
    private int speed;  //0
    private boolean start; //false
    private Tire tire; //null

    public CarDTO(){

    }

    public CarDTO(String _model, Tire _tire){
        this.model = _model;
        this.tire = _tire;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public Tire getTrie() {
        return tire;
    }

    public void setTrie(Tire trie) {
        this.tire = trie;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", start=" + start +
                ", trie=" + tire +
                '}';
    }
}
