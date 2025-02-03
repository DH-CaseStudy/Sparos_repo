package day01.homework.coffeEX;

public class Coffee extends Beverage{
    public static int amount;

    public Coffee(String name, int price) {
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
        Coffee.amount = amount;
    }
}
