package day01.homework.coffeEX;

public class Tea extends Beverage{
    public static int amount;

    public Tea(String name, int price) {
        super(name, price);
        amount++;
    }

    @Override
    public void calcPrice() {

    }

    public static int getAmount() {
        return amount;
    }

    public static void setAmount(int amount) {
        Tea.amount = amount;
    }
}
