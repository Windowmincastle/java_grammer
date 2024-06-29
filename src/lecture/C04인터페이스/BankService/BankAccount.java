package C04인터페이스.BankService;


public class BankAccount{
    static long static_id =0L;
    private long id;
    private String accountNumber;
    private int balance;
    private int pay;

    BankAccount(String accountNumber){
        static_id +=1 ;
        id = static_id;
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }

    public Long getId() {
        return id;
    }
//    이 메서드의 명확성을 가지고 있어야지 사용하는 사람 입장에서도 명확하게 인지를할 수 있다.
    public void updateBalance(int balance) {
        this.balance = balance;
    }

    public int getPay() {
        return pay;
    }
}