package C04인터페이스.BankService;

public class BankKakaoService implements BankService{

    @Override
    public void deposit(int money, BankAccount bankAccount){
        int myMoney = bankAccount.getBalance();
        int total = myMoney + money;
        bankAccount.updateBalance(total);
        System.out.println(  money+"원 카드로 입금되었습니다.");
        System.out.println(" 현재 잔액은 " + total);
    }
    @Override
    public void withdraw(int money ,BankAccount bankAccount){

        int currentMoney = bankAccount.getBalance();

        if(currentMoney < money){
            System.out.println("잔액 부족입니다.");
        }else {
            currentMoney -= money;
            bankAccount.updateBalance(currentMoney);
            System.out.println(money + "원 카드로 출금되었습니다.");
        }
        System.out.println("현재 잔액은 " + currentMoney);
    }

}