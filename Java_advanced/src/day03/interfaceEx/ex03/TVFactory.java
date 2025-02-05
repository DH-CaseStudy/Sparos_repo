package day03.interfaceEx.ex03;

public class TVFactory extends Factory implements IWorkingTogether{

    public TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    int makeProducts(char skill) {
        return 0;
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return 0;
    }
}
