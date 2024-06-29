//package C04인터페이스.BankService;
//import C02ClassBasic.실습패키지.BankService;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class BankController {
//    public static void main(String[] args) {
//
//        System.out.println("계좌번호를 입력하세요");
//        Scanner sc = new Scanner(System.in);
//        String accountNumber = sc.nextLine();
//        BankAccount bankAccount = new BankAccount(accountNumber);
//
//        while (true){
//
//            System.out.println("서비스 번호를 입력하세요. 1.카드 2. 카페");
//            int number = Integer.parseInt(sc.nextLine());
//            System.out.println("입금 1번, 출금 2번");
//            int number2 = Integer.parseInt(sc.nextLine());
//
//            if(number == 1){
//                BankCardService bcs = new BankCardService();
//                if (number2==1) {
//                    System.out.println("입금 금액 입력");
//                    int money = Integer.parseInt(sc.nextLine());
//                    bcs.deposit(money,bankAccount);
//                } else {
//                    System.out.println("출금 금액 입력");
//                    int money = Integer.parseInt(sc.nextLine());
//                    bcs.withdraw(money,bankAccount);
//                }
//
//            }else if (number == 2){
//                System.out.println("카카오 페이");
//                BankService bcs = new BankKakaoService();
//                if (number2==1)
//                    System.out.println("입금 금액 입력");
//                    int money = Integer.parseInt(sc.nextLine());
//                    bcs.deposit(money,bankAccount);
//                } else if (number2==2) {
//                    System.out.println("출금 금액 입력");
//                    int money = Integer.parseInt(sc.nextLine());
//                    bcs.deposit(money,bankAccount);
//                }
//            }
//
//        }
//    }
//}