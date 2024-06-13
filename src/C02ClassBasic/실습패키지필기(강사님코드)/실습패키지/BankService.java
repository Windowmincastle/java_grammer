package C02ClassBasic.실습패키지필기;

public class BankService {

    void deposit(int num , C02ClassBasic.실습패키지필기.BankAccount bank) {
        bank.balance += num;
        System.out.println(num+"원 입금 완료");
    }

    void withdraw(int wdw, C02ClassBasic.실습패키지필기.BankAccount bank) {

        if (bank.balance > wdw) {
            bank.balance -= wdw;
            System.out.println(wdw + "원 출금 완료");
        } else {
            System.out.println("잔액 부족");
            System.out.println("현재 잔액은 "+wdw+"원 입니다.");
        }
    }

}
