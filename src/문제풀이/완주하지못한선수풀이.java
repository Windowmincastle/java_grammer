package 문제풀이;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수풀이 {

    public static void main(String[] args) {
        String[] participants = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        String answer ="";
        Map<String, Integer> parti = new HashMap<>();

        for (String p : participants) {
            parti.put(p, parti.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            if (parti.containsKey(c)) {

            }
        }
    }
}
