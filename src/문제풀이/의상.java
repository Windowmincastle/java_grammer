package 문제풀이;

import java.util.HashMap;
import java.util.Map;

public class 의상 {

//    주어진 의상 목록을 옷의 종류별로 난 ㄴ다
//    각 종류별 선택의 수를 계산한다. 각 종류별로 해당 종류의 옷을 입는 경우의 수를 구한다.
//    전체 조합의 수 계산 : 각 종류별로 입는 경우의 수를 모두 곱한 후, 아무것도 입지 않는 경우를 빼준다

    static String[][] clothes =
            {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};



    public static void main(String[] args) {


        Map<String, String> clothesMap = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            for (int j = 0; j < clothes[i].length-1; j++) {
                clothesMap.put(clothes[i][j+1],clothes[i][j]);
            }
        }

        System.out.println(clothesMap);

    }
}
