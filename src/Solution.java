import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        // int 배열을 String 배열로 변환
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        for (String s : strNumbers) {
            System.out.println("12라인"+s);
        }

        // Comparator를 사용하여 정렬
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        // 모든 숫자가 0인 경우 "0"을 반환
        if (strNumbers[0].equals("0")) {
            return "0";
        }

        // 문자열을 하나로 합침
        StringBuilder answer = new StringBuilder();
        for (String num : strNumbers) {
            answer.append(num);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] numbers1 = {6, 10, 2};
        int[] numbers2 = {3, 30, 34, 5, 9};

        System.out.println(sol.solution(numbers1)); // 출력: 6210
        System.out.println(sol.solution(numbers2)); // 출력: 9534330
    }
}
