package C07ExceptionFileParsing.AuthorException;
// 사용자와 최접점에 있는 것. 입력받고~출력해주고~ 그런거


import java.util.Scanner;

/*
AuthorService 객체를 생성

실제 비즈니스 로직은 서비스한테 던진다.
1. 회원가입 : name,email,password를 입력 받아서 객체 생성 후 service의 register 메서드 호출
-> service에서 Author 객체 생성하여 ->
2. 로그인

 */
public class AuthorController {
    public static void main(String[] args) {

        AuthorService authorService = new AuthorService();
        while (true) {

            System.out.println("환영합니다.");
            System.out.println("[1] 회원가입 , [2] 로그인, [3] 종료");
            System.out.println("이용 서비스 번호를 눌러주세요");

            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                authorService.regsiter();
            } else if (choice == 2) {
                authorService.login();
            } else {
                System.out.println("감사합니다");
                break;
            }

        }

    }
}
