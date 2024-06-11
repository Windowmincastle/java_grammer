package 문제풀이;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
    public String[] solution(String[] strings, int n) {

        String[] answer = new String[strings.length];
        // Comparator를 사용하여 정렬 기준 정의
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 인덱스 n의 문자 비교
                if (s1.charAt(n) == s2.charAt(n)) {
                    // 인덱스 n의 문자가 같으면 사전순으로 비교
                    return s1.compareTo(s2);
                } else {
                    // 인덱스 n의 문자 비교
                    return Character.compare(s1.charAt(n), s2.charAt(n));
                }
            }
        });

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();

        // 테스트 케이스 1
        String[] strings1 = {"sun", "bed", "car"};
        int n1 = 1;
        System.out.println(Arrays.toString(sol.solution(strings1, n1))); // 출력: [car, bed, sun]

        // 테스트 케이스 2
        String[] strings2 = {"abce", "abcd", "cdx"};
        int n2 = 2;
        System.out.println(Arrays.toString(sol.solution(strings2, n2))); // 출력: [abcd, abce, cdx]
    }
}
