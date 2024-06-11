package 문제풀이;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(String[][] clothes) {
        // 옷의 종류별로 나누기 위한 HashMap
        Map<String, Integer> clothesMap = new HashMap<>();

        // 옷의 종류별로 의상 수를 카운트
        for (String[] cloth : clothes) {
            String kind = cloth[1];
            System.out.println("cloth[1] ->"+cloth[1]);
            clothesMap.put(kind, clothesMap.getOrDefault(kind, 0) + 1);
        }

        System.out.println(clothesMap);

        // 각 종류별 선택의 수 계산 (해당 종류의 옷 수 + 1)
        // (옷을 입지않는 경우, 노란모자를 쓰는경우 , 그린터번을 입는 경우)
        int totalCombinations = 1;
        for (int count : clothesMap.values()) {
            totalCombinations *= (count + 1);
        }

        // 전체 조합 수 계산 (아무것도 입지 않는 경우 - 1)
        int answer = totalCombinations - 1;

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 예제 1
        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(sol.solution(clothes1)); // 출력: 5

        // 예제 2
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(sol.solution(clothes2)); // 출력: 3
    }
}
