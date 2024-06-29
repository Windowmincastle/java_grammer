package lecture.C02ClassBasic.실습패키지;

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

                BankAccount bankAccount = new BankAccount(want); // 강사님 코드인데 이렇게하면 인스턴스 이름이 다 같지않나?
                //근데 문제가 생기지 않을 것 같다. 어차피 리스트에 같은 이름이 있다고 하더라도 인덱스 번호로 구분을 해서 계좌번호를 비교하면 된다.
                bankAccounts.add(bankAccount); //계좌번호 동적 생성후 추가 까지는 했다?

                System.out.println("테스트 sout ->>"+bankAccounts.get(0));
                System.out.println("계좌 생성 완료");
                System.out.println("고객님의 계좌번호는 ->"+want+" 입니다.");

            } else if (choice == 2) {

                Scanner deposit = new Scanner(System.in);
                System.out.println("계좌 번호를 입력하세요");
                String actNumber = deposit.nextLine();
                System.out.println("입금 금액을 입력하세요");
                int money = deposit.nextInt();

                for (int i = 0; i < bankAccounts.size(); i++) {
                    if (bankAccounts.get(i).getAccountNumber().equals(actNumber)) {
                        bankAccounts.get(i).deposit(money);
                    }
                }
                //출금도 같은 원리

            } else if (choice == 3) {
                System.out.println("얼마 출금 하시겠어요?");

                System.out.println("아직 개발 중 입니다.");

            } else if (choice == 4) {
                Scanner deposit = new Scanner(System.in);
                System.out.println("본인 계좌번호 입력");
                String myNumber = deposit.nextLine();
                System.out.println("상대 계좌번호 입력");
                String yourNumber = deposit.nextLine();

                //입력받기
                int money = deposit.nextInt();
                BankAccount myAcoount = null;
                BankAccount yourAccount = null;
                for (int i = 0; i < bankAccounts.size(); i++) {

                    if (bankAccounts.get(i).getAccountNumber().equals(myNumber)) {
                        myAcoount = bankAccounts.get(i);
                    }


                    if (bankAccounts.get(i).getAccountNumber().equals(yourNumber)) {
                        yourAccount = bankAccounts.get(i);
                    }
                }

//이제 trasnfer 메서드


            } else if (choice == 5) {
                System.out.println("프로그램을 종료합니다. 감사합니다");
                break;
            } else {
                System.out.println("1~5번 중 선택 하세요");
            }



        }

    }

}
