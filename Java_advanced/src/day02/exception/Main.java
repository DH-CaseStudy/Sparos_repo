package day02.exception;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        System.out.println("현재 잔고는 " + account.getBalance() + " 입니다");

        try {
            account.withDraw(3000000);
        } catch (InsufficientEx e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
