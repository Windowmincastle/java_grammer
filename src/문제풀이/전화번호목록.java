package 문제풀이;

import java.util.Arrays;

public class 전화번호목록 {

    public static boolean solution(String[] phone_book) {

//        subString으로도 풀수있다.

        // 전화번호 목록을 정렬합니다.
        Arrays.sort(phone_book);

        // 정렬된 전화번호 목록에서 인접한 두 번호를 비교합니다.
        for (int i = 0; i < phone_book.length - 1; i++) {
            // 현재 번호가 다음 번호의 접두어인지 확인합니다.
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                // 접두어 관계가 있으면 false를 반환합니다.
                return false;
            }
        }
//
        // 접두어 관계가 없으면 true를 반환합니다.
        return true;
    }

    public static void main(String[] args) {
        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123", "456", "789"};
        String[] phone_book3 = {"12", "123", "1235", "567", "88"};

        System.out.println(solution(phone_book1)); // false
        System.out.println(solution(phone_book2)); // true
        System.out.println(solution(phone_book3)); // false
    }
}
