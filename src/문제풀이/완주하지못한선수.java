package 문제풀이;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {

    public static void main(String[] args) {

        String[] participants = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        String answer ="";

//      참석자 명단을 map에 저장한다. Integer String?
//      참석자 명단 배열을 반복문으로 탐색하면서 완주자 명단에 해당 데이터가 존재하지 않는다면
//      answer 배열에 데이터를 추가한다.

        Map<String, String> map = new HashMap<>();


        for (String participant : participants) {

            map.put(participant, participant);
        }
        for (String com : completion) {
            if (map.containsKey(com)) {
                map.remove(com);
            }
        }

//        answer에 담아서 출력만 하면되는데;;;
        for (String a : map.keySet()) {
            answer = a;
        }
        System.out.println(answer);
    }
}
