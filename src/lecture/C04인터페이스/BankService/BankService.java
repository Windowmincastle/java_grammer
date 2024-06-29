package C04인터페이스.BankService;

import C04인터페이스.BankAccount;

public interface BankService {

    void deposit(int a, BankAccount b);
    void withdraw(int a, BankAccount b);

}
