package lecture.C02ClassBasic.실습패키지필기;

public class BankAccount {

    String accountNumber;
    int balance;

    BankAccount() {

    }

    BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    void deposit(int num) {
        balance += num;
        System.out.println(num+"원 입금 완료");
    }

    void withdraw(int wdw) {

        if (balance > wdw) {
            balance -= wdw;
            System.out.println(wdw + "원 출금 완료");
        } else {
            System.out.println("잔액 부족");
            System.out.println("현재 잔액은 "+wdw+"원 입니다.");
        }
    }

    public void trasnfer(int money,BankAccount start) {
        this.balance -= money;
        start.deposit(money);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }


}