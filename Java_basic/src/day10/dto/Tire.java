package day10.dto;

public class Tire {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "model='" + model + '\'' +
                '}';
    }
}
