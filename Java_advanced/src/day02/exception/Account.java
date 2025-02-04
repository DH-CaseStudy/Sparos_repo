package day02.exception;

public class Account {
    private long balance; //계좌 잔고 저장멤버

    public Account() {
    }

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void deposit(int money) {
        this.balance += money; //입금.
    }

    public void withDraw(int money) throws InsufficientEx { //호출한 곳으로 예외처리를 요청함.
        if (this.balance < money) {
            throw new InsufficientEx("잔고가 부족합니다. 현재 잔액 : " + this.balance);
        } else {
            this.balance -= money;
        }

    }


}
