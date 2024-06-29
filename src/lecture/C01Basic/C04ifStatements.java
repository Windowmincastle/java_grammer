package lecture.C01Basic;

import java.util.Scanner;

public class C04ifStatements {

    public static void main(String[] args) {

        //도어락키 if문

        Scanner sc = new Scanner(System.in);
        int ans = 1234;
        int password = sc.nextInt();

        if (ans == password) {

            System.out.println("문이 열립니다");

        } else {
            System.out.println("비밀번호가 틀렸습니다.");
        }

        // 삼항 연산자
//        Scanner sc2  = new Scanner(System.in);
//        int answer = 1234;
//        System.out.println("비밀번호 입력하시오 : ");
//        int input = sc2.nextInt();
//
//        String result = (answer == input) ? "문이 열렸습니다." : "비밀번호가 틀렸습니다.";
//        System.out.println(result);


        // switch문. if else if else등의 조건문을 가독성 있게 표현하는 구문
        Scanner sc2  = new Scanner(System.in);
        System.out.print("원하시는 서비스번호를 입력하세요 : ");
        int input = sc2.nextInt();
        switch(input) {
            case 0:
                System.out.println("상담사 연결.");
                break;
            case 1:
                System.out.println("대출업무입니다.");
                break;
            case 2:
                System.out.println("예금업무입니다.");
                break;
            case 3:
                System.out.println("적금업무입니다.");
                break;
            default:
                System.out.println("잘못입력하셨습니다.");
                break;
        }
    }
}
