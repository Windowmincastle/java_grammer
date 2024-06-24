package ETC;

import java.util.Scanner;
import java.util.regex.Pattern;

public class 이메일검증 {

    public static void main(String[] args) {

        //이메일 검증 : 소문자 알파벳과 숫자로 이루어진 id@알파벳
//       예시 abc@naver.com , 정규표현식 아니면 빡세다
        while (true) {
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            boolean b = Pattern.matches("^[a-z0-9]+@[a-z]+.com$",email);

            if (b) {
                System.out.println("올바른 형식입니다.");
                break;
            } else {
                System.out.println("다시 입력하세요");
            }

        }


    }

}
