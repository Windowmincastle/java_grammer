package C04인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {

        List<BankAccount> bankAccounts = new ArrayList<>();

        while (true) {

            System.out.println("진행을 원하는 숫자를 입력하세요");
            System.out.println("[1] 계좌 생성 / [2] 입금하기 / [3] 출금하기 / [4].계좌 송금 / [5] 종료 ");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            if (choice == 1) {
                input.nextLine();
                System.out.println("사용하고 싶은 계좌번호를 입력하세요. 숫자로만");
                String want = input.nextLine();
                bankAccounts.add( new BankAccount(want) ); //계좌번호 동적 생성
                System.out.println("계좌 생성 완료");
                System.out.println("고객님의 계좌번호는 ->"+want+" 입니다.");

            } else if (choice == 2) {

                Scanner deposit = new Scanner(System.in);
                System.out.println("계좌 번호를 입력하세요");
                String actNumber = deposit.nextLine();
                System.out.println("입금 금액을 입력하세요");
                int money = deposit.nextInt();
                int idx = bankAccounts.indexOf(actNumber);

                BankAccount temp = bankAccounts.get(idx);

                if (bankAccounts.contains(temp.getAccountNumber())) {
                    temp.deposit(money);
                    System.out.println("입금완료 현재 잔액 :"+temp.getBalance());
                } else {
                    System.out.println("계좌번호가 존재하지 않습니다.");
                }

            } else if (choice == 3) {
                System.out.println("아직 개발 중 입니다.");

            } else if (choice == 4) {
                System.out.println("아직 개발 중 입니다.");
            } else if (choice == 5) {
                System.out.println("프로그램을 종료합니다. 감사합니다");
                break;
            } else {
                System.out.println("1~5번 중 선택 하세요");
            }



        }

    }

}
