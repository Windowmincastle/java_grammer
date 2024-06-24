package ETC;

import java.util.Scanner;
import java.util.regex.Pattern;

public class 전화번호검증프로그램 {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine();
            boolean check = false;
            if (Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", number)) { // 정규표현식이랑 number가 일치하느냐?
                System.out.println("올바른 입력입니다");
                break;
            } else {
                System.out.println("틀린 형식의 전화번호 입니다");
            }
        }

    }
}
